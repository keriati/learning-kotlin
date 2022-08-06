package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

// interfaces
interface CourseRepository {
    var isCoursePersisted : Boolean
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Course: $course")
        return course.id
    }

}

interface Repository {
    fun getAll(): Any
}

// multiple interfaces can be implemented
class SqlCourseRepository: CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Foo", "Bar")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository: CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Foo", "Bar")
    }

    override fun save(course: Course): Int {
        println("NoSqlSaveOverride")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB: A,B {
    override fun doSomething() {
        // passing a generic to decide which interface method to invoke
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }
}


fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(2)
    println("Course is $course")
    val courseId = sqlCourseRepository.save(course)
    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")
    println("Course id id $courseId")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course2 = noSqlCourseRepository.getById(3)
    println("Course is $course2")
    val courseId2 = noSqlCourseRepository.save(course)
    println("Course id id $courseId2")

    val ab = AB()

    ab.doSomething()
}



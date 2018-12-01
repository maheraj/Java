# Multithreading
Threads are lightweight process within process. It allows concurrent execution of two or more parts of a program to mazimise the CPU utilization

## Thread Creation
* Thread Class
* Runnable Interface

## Thread States
* NEW
* RUNNABLE
* BLOCKED
* WAITING
* TIMED_WAITING
* TERMINATED

## Main Thread
For each program, a Main thread is created by JVM(Java Virtual Machine). The “Main” thread first verifies the existence of the main() method, and then it initializes the class

## Deadlocking
mainthread.join() will create a deadlock. The statement “Thread.currentThread().join()”, will tell Main thread to wait for this thread(i.e. wait for itself) to die. Thus Main thread wait for itself to die, which is nothing but a deadlock.

## Synchronized Multithreading
synchronized keyword is used to make the class or method thread-safe which means only one thread can have lock of synchronized method and use it, other threads have to wait till the lock releases and anyone of them acquire that lock.

* synchronized object
* synchronized method
* synchronised block in method

## What does start() function do in multithreading in Java?
It creates a call stack and a seperate call stack is created by JVM by running run() method. This way JVM handle some special cases like each thread will be assigned a seperate id.

## Thread Priority
* Priority Rance 1 to 10. Min priority 1 and max priority 10. Default priority 5
* Main Thread priority is 5
* Child Thread priority depends on parent thread priority
* highest priority thread will be executed first than the lower priority thread
* If two thread have the same priority it depends on Thread Scheduling's algorithm (Round-Robin, First Come First Serve, etc.)

## Daemon Thread
Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection

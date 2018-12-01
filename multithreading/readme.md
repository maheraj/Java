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
* synchronized object
* synchronized method
* synchronised block in method

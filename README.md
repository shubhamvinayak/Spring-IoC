# Spring-IoC
Spring Inversion of Control example using applicationContext.xml

The IoC container is responsible to instantiate, configure and assemble the objects. The IoC container gets informations from the XML
file and works accordingly. The main tasks performed by IoC container are:

* Instantiate the application class
* Configure the object
* Assemble the dependencies between the objects

The advantages of this architecture are:

1.Decoupling the execution of a task from its implementation.

2.Making it easier to switch between different implementations.

3.Greater modularity of a program.

4.Greater ease in testing a program by isolating a component or mocking its dependencies and allowing components to communicate
through contracts.

Configuration of Spring container includes:
1. Configure spring beans
2. Create Spring Container.
3. Retrive beans from the container

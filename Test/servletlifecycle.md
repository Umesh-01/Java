![image](https://user-images.githubusercontent.com/83420185/169653616-ffbfef1d-d48d-48f9-afd3-e979980272ab.png)

A servlet life cycle can be defined as the entire process from its creation till the destruction. The following are the paths followed by a servlet.

The servlet is initialized by calling the init() method.

The servlet calls service() method to process a client's request.

The servlet is terminated by calling the destroy() method.

Finally, servlet is garbage collected by the garbage collector of the JVM.


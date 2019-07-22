(ns com.google.cloud.compute.v1.RouteClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RouteClient routeClient = RouteClient.create()) {
    ProjectGlobalRouteName route = ProjectGlobalRouteName.of(\"[PROJECT]\", \"[ROUTE]\");
    Operation response = routeClient.deleteRoute(route);
  }

  Note: close() needs to be called on the routeClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of RouteSettings to create(). For
  example:

  To customize credentials:



  RouteSettings routeSettings =
      RouteSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RouteClient routeClient =
      RouteClient.create(routeSettings);

  To customize the endpoint:



  RouteSettings routeSettings =
      RouteSettings.newBuilder().setEndpoint(myEndpoint).build();
  RouteClient routeClient =
      RouteClient.create(routeSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouteClient]))

(defn *create
  "Constructs an instance of RouteClient, using the given settings. The channels are created based
   on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RouteSettings`

  returns: `com.google.cloud.compute.v1.RouteClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RouteClient [^com.google.cloud.compute.v1.RouteSettings settings]
    (RouteClient/create settings))
  (^com.google.cloud.compute.v1.RouteClient []
    (RouteClient/create )))

(defn get-route-callable
  "Returns the specified Route resource. Gets a list of available routes by making a list()
   request.

   Sample code:



   try (RouteClient routeClient = RouteClient.create()) {
     String formattedRoute = ProjectGlobalRouteName.format(\"[PROJECT]\", \"[ROUTE]\");
     GetRouteHttpRequest request = GetRouteHttpRequest.newBuilder()
       .setRoute(formattedRoute)
       .build();
     ApiFuture<Route> future = routeClient.getRouteCallable().futureCall(request);
     // Do something
     Route response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRouteHttpRequest,com.google.cloud.compute.v1.Route>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteClient this]
    (-> this (.getRouteCallable))))

(defn list-routes-paged-callable
  "Retrieves the list of Route resources available to the specified project.

   Sample code:



   try (RouteClient routeClient = RouteClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListRoutesHttpRequest request = ListRoutesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListRoutesPagedResponse> future = routeClient.listRoutesPagedCallable().futureCall(request);
     // Do something
     for (Route element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteClient$ListRoutesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteClient this]
    (-> this (.listRoutesPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RouteSettings`"
  (^com.google.cloud.compute.v1.RouteSettings [^RouteClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RouteStub`"
  ([^RouteClient this]
    (-> this (.getStub))))

(defn insert-route
  "Creates a Route resource in the specified project using the data included in the request.

   Sample code:



   try (RouteClient routeClient = RouteClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Route routeResource = Route.newBuilder().build();
     Operation response = routeClient.insertRoute(project, routeResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  route-resource - Represents a Route resource. A route specifies how certain packets should be handled by the network. Routes are associated with instances by tags and the set of routes for a particular instance is called its routing table. For each packet leaving an instance, the system searches that instance's routing table for a single best matching route. Routes match packets by destination IP address, preferring smaller or more specific ranges over larger ones. If there is a tie, the system selects the route with the smallest priority value. If there is still a tie, it uses the layer three and four packet headers to select just one of the remaining matching routes. The packet is then forwarded as specified by the nextHop field of the winning route - either to another instance destination, an instance gateway, or a Google Compute Engine-operated gateway. Packets that do not match any route in the sending instance's routing table are dropped. (== resource_for beta.routes ==) (== resource_for v1.routes ==) - `com.google.cloud.compute.v1.Route`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RouteClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.Route route-resource]
    (-> this (.insertRoute project route-resource)))
  (^com.google.cloud.compute.v1.Operation [^RouteClient this ^com.google.cloud.compute.v1.InsertRouteHttpRequest request]
    (-> this (.insertRoute request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RouteClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RouteClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^RouteClient this]
    (-> this (.shutdown))))

(defn delete-route-callable
  "Deletes the specified Route resource.

   Sample code:



   try (RouteClient routeClient = RouteClient.create()) {
     String formattedRoute = ProjectGlobalRouteName.format(\"[PROJECT]\", \"[ROUTE]\");
     DeleteRouteHttpRequest request = DeleteRouteHttpRequest.newBuilder()
       .setRoute(formattedRoute)
       .build();
     ApiFuture<Operation> future = routeClient.deleteRouteCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteClient this]
    (-> this (.deleteRouteCallable))))

(defn list-routes
  "Retrieves the list of Route resources available to the specified project.

   Sample code:



   try (RouteClient routeClient = RouteClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Route element : routeClient.listRoutes(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.RouteClient$ListRoutesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RouteClient$ListRoutesPagedResponse [^RouteClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listRoutes project))))

(defn close
  ""
  ([^RouteClient this]
    (-> this (.close))))

(defn get-route
  "Returns the specified Route resource. Gets a list of available routes by making a list()
   request.

   Sample code:



   try (RouteClient routeClient = RouteClient.create()) {
     ProjectGlobalRouteName route = ProjectGlobalRouteName.of(\"[PROJECT]\", \"[ROUTE]\");
     Route response = routeClient.getRoute(route);
   }

  route - Name of the Route resource to return. - `com.google.cloud.compute.v1.ProjectGlobalRouteName`

  returns: `com.google.cloud.compute.v1.Route`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Route [^RouteClient this ^com.google.cloud.compute.v1.ProjectGlobalRouteName route]
    (-> this (.getRoute route))))

(defn insert-route-callable
  "Creates a Route resource in the specified project using the data included in the request.

   Sample code:



   try (RouteClient routeClient = RouteClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     Route routeResource = Route.newBuilder().build();
     InsertRouteHttpRequest request = InsertRouteHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setRouteResource(routeResource)
       .build();
     ApiFuture<Operation> future = routeClient.insertRouteCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteClient this]
    (-> this (.insertRouteCallable))))

(defn list-routes-callable
  "Retrieves the list of Route resources available to the specified project.

   Sample code:



   try (RouteClient routeClient = RouteClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListRoutesHttpRequest request = ListRoutesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       RouteList response = routeClient.listRoutesCallable().call(request);
       for (Route element : response.getItemsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouteClient this]
    (-> this (.listRoutesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RouteClient this]
    (-> this (.isTerminated))))

(defn delete-route
  "Deletes the specified Route resource.

   Sample code:



   try (RouteClient routeClient = RouteClient.create()) {
     ProjectGlobalRouteName route = ProjectGlobalRouteName.of(\"[PROJECT]\", \"[ROUTE]\");
     Operation response = routeClient.deleteRoute(route);
   }

  route - Name of the Route resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalRouteName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RouteClient this ^com.google.cloud.compute.v1.ProjectGlobalRouteName route]
    (-> this (.deleteRoute route))))

(defn shutdown-now
  ""
  ([^RouteClient this]
    (-> this (.shutdownNow))))


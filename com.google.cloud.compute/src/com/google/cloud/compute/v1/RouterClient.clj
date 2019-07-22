(ns com.google.cloud.compute.v1.RouterClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RouterClient routerClient = RouterClient.create()) {
    ProjectRegionRouterName router = ProjectRegionRouterName.of(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
    Operation response = routerClient.deleteRouter(router);
  }

  Note: close() needs to be called on the routerClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of RouterSettings to create().
  For example:

  To customize credentials:



  RouterSettings routerSettings =
      RouterSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RouterClient routerClient =
      RouterClient.create(routerSettings);

  To customize the endpoint:



  RouterSettings routerSettings =
      RouterSettings.newBuilder().setEndpoint(myEndpoint).build();
  RouterClient routerClient =
      RouterClient.create(routerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterClient]))

(defn *create
  "Constructs an instance of RouterClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RouterSettings`

  returns: `com.google.cloud.compute.v1.RouterClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RouterClient [^com.google.cloud.compute.v1.RouterSettings settings]
    (RouterClient/create settings))
  (^com.google.cloud.compute.v1.RouterClient []
    (RouterClient/create )))

(defn delete-router
  "Deletes the specified Router resource.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectRegionRouterName router = ProjectRegionRouterName.of(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     Operation response = routerClient.deleteRouter(router);
   }

  router - Name of the Router resource to delete. - `com.google.cloud.compute.v1.ProjectRegionRouterName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RouterClient this ^com.google.cloud.compute.v1.ProjectRegionRouterName router]
    (-> this (.deleteRouter router))))

(defn insert-router-callable
  "Creates a Router resource in the specified project and region using the data included in the
   request.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     Router routerResource = Router.newBuilder().build();
     InsertRouterHttpRequest request = InsertRouterHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setRouterResource(routerResource)
       .build();
     ApiFuture<Operation> future = routerClient.insertRouterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.insertRouterCallable))))

(defn get-nat-mapping-info-routers
  "Retrieves runtime Nat mapping information of VM endpoints.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectRegionRouterName router = ProjectRegionRouterName.of(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     for (VmEndpointNatMappings element : routerClient.getNatMappingInfoRouters(router).iterateAll()) {
       // doThingsWith(element);
     }
   }

  router - Name of the Router resource to query for Nat Mapping information of VM endpoints. - `com.google.cloud.compute.v1.ProjectRegionRouterName`

  returns: `com.google.cloud.compute.v1.RouterClient$GetNatMappingInfoRoutersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RouterClient$GetNatMappingInfoRoutersPagedResponse [^RouterClient this ^com.google.cloud.compute.v1.ProjectRegionRouterName router]
    (-> this (.getNatMappingInfoRouters router))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RouterSettings`"
  (^com.google.cloud.compute.v1.RouterSettings [^RouterClient this]
    (-> this (.getSettings))))

(defn get-router-status-router
  "Retrieves runtime information of the specified router.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectRegionRouterName router = ProjectRegionRouterName.of(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     RouterStatusResponse response = routerClient.getRouterStatusRouter(router);
   }

  router - Name of the Router resource to query. - `com.google.cloud.compute.v1.ProjectRegionRouterName`

  returns: `com.google.cloud.compute.v1.RouterStatusResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RouterStatusResponse [^RouterClient this ^com.google.cloud.compute.v1.ProjectRegionRouterName router]
    (-> this (.getRouterStatusRouter router))))

(defn patch-router-callable
  "Patches the specified Router resource with the data included in the request. This method
   supports PATCH semantics and uses JSON merge patch format and processing rules.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRouter = ProjectRegionRouterName.format(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     Router routerResource = Router.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchRouterHttpRequest request = PatchRouterHttpRequest.newBuilder()
       .setRouter(formattedRouter)
       .setRouterResource(routerResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = routerClient.patchRouterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.patchRouterCallable))))

(defn list-routers-paged-callable
  "Retrieves a list of Router resources available to the specified project.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRoutersHttpRequest request = ListRoutersHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListRoutersPagedResponse> future = routerClient.listRoutersPagedCallable().futureCall(request);
     // Do something
     for (Router element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterClient$ListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.listRoutersPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RouterStub`"
  ([^RouterClient this]
    (-> this (.getStub))))

(defn get-router-status-router-callable
  "Retrieves runtime information of the specified router.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRouter = ProjectRegionRouterName.format(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     GetRouterStatusRouterHttpRequest request = GetRouterStatusRouterHttpRequest.newBuilder()
       .setRouter(formattedRouter)
       .build();
     ApiFuture<RouterStatusResponse> future = routerClient.getRouterStatusRouterCallable().futureCall(request);
     // Do something
     RouterStatusResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRouterStatusRouterHttpRequest,com.google.cloud.compute.v1.RouterStatusResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.getRouterStatusRouterCallable))))

(defn list-routers-callable
  "Retrieves a list of Router resources available to the specified project.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRoutersHttpRequest request = ListRoutersHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       RouterList response = routerClient.listRoutersCallable().call(request);
       for (Router element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.listRoutersCallable))))

(defn get-nat-mapping-info-routers-paged-callable
  "Retrieves runtime Nat mapping information of VM endpoints.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRouter = ProjectRegionRouterName.format(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     GetNatMappingInfoRoutersHttpRequest request = GetNatMappingInfoRoutersHttpRequest.newBuilder()
       .setRouter(formattedRouter)
       .build();
     ApiFuture<GetNatMappingInfoRoutersPagedResponse> future = routerClient.getNatMappingInfoRoutersPagedCallable().futureCall(request);
     // Do something
     for (VmEndpointNatMappings element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.RouterClient$GetNatMappingInfoRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.getNatMappingInfoRoutersPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RouterClient this]
    (-> this (.isShutdown))))

(defn get-nat-mapping-info-routers-callable
  "Retrieves runtime Nat mapping information of VM endpoints.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRouter = ProjectRegionRouterName.format(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     GetNatMappingInfoRoutersHttpRequest request = GetNatMappingInfoRoutersHttpRequest.newBuilder()
       .setRouter(formattedRouter)
       .build();
     while (true) {
       VmEndpointNatMappingsList response = routerClient.getNatMappingInfoRoutersCallable().call(request);
       for (VmEndpointNatMappings element : response.getResultList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.VmEndpointNatMappingsList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.getNatMappingInfoRoutersCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RouterClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn preview-router-callable
  "Preview fields auto-generated during router create and update operations. Calling this method
   does NOT create or update the router.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRouter = ProjectRegionRouterName.format(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     Router routerResource = Router.newBuilder().build();
     PreviewRouterHttpRequest request = PreviewRouterHttpRequest.newBuilder()
       .setRouter(formattedRouter)
       .setRouterResource(routerResource)
       .build();
     ApiFuture<RoutersPreviewResponse> future = routerClient.previewRouterCallable().futureCall(request);
     // Do something
     RoutersPreviewResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PreviewRouterHttpRequest,com.google.cloud.compute.v1.RoutersPreviewResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.previewRouterCallable))))

(defn preview-router
  "Preview fields auto-generated during router create and update operations. Calling this method
   does NOT create or update the router.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectRegionRouterName router = ProjectRegionRouterName.of(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     Router routerResource = Router.newBuilder().build();
     RoutersPreviewResponse response = routerClient.previewRouter(router, routerResource);
   }

  router - Name of the Router resource to query. - `com.google.cloud.compute.v1.ProjectRegionRouterName`
  router-resource - Router resource. - `com.google.cloud.compute.v1.Router`

  returns: `com.google.cloud.compute.v1.RoutersPreviewResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RoutersPreviewResponse [^RouterClient this ^com.google.cloud.compute.v1.ProjectRegionRouterName router ^com.google.cloud.compute.v1.Router router-resource]
    (-> this (.previewRouter router router-resource)))
  (^com.google.cloud.compute.v1.RoutersPreviewResponse [^RouterClient this ^com.google.cloud.compute.v1.PreviewRouterHttpRequest request]
    (-> this (.previewRouter request))))

(defn shutdown
  ""
  ([^RouterClient this]
    (-> this (.shutdown))))

(defn patch-router
  "Patches the specified Router resource with the data included in the request. This method
   supports PATCH semantics and uses JSON merge patch format and processing rules.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectRegionRouterName router = ProjectRegionRouterName.of(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     Router routerResource = Router.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = routerClient.patchRouter(router, routerResource, fieldMask);
   }

  router - Name of the Router resource to patch. - `com.google.cloud.compute.v1.ProjectRegionRouterName`
  router-resource - Router resource. - `com.google.cloud.compute.v1.Router`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RouterClient this ^com.google.cloud.compute.v1.ProjectRegionRouterName router ^com.google.cloud.compute.v1.Router router-resource ^java.util.List field-mask]
    (-> this (.patchRouter router router-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^RouterClient this ^com.google.cloud.compute.v1.PatchRouterHttpRequest request]
    (-> this (.patchRouter request))))

(defn update-router-callable
  "Updates the specified Router resource with the data included in the request.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRouter = ProjectRegionRouterName.format(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     Router routerResource = Router.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateRouterHttpRequest request = UpdateRouterHttpRequest.newBuilder()
       .setRouter(formattedRouter)
       .setRouterResource(routerResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = routerClient.updateRouterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.updateRouterCallable))))

(defn close
  ""
  ([^RouterClient this]
    (-> this (.close))))

(defn delete-router-callable
  "Deletes the specified Router resource.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRouter = ProjectRegionRouterName.format(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     DeleteRouterHttpRequest request = DeleteRouterHttpRequest.newBuilder()
       .setRouter(formattedRouter)
       .build();
     ApiFuture<Operation> future = routerClient.deleteRouterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.deleteRouterCallable))))

(defn get-router-callable
  "Returns the specified Router resource. Gets a list of available routers by making a list()
   request.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedRouter = ProjectRegionRouterName.format(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     GetRouterHttpRequest request = GetRouterHttpRequest.newBuilder()
       .setRouter(formattedRouter)
       .build();
     ApiFuture<Router> future = routerClient.getRouterCallable().futureCall(request);
     // Do something
     Router response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRouterHttpRequest,com.google.cloud.compute.v1.Router>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.getRouterCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RouterClient this]
    (-> this (.isTerminated))))

(defn aggregated-list-routers-callable
  "Retrieves an aggregated list of routers.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListRoutersHttpRequest request = AggregatedListRoutersHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       RouterAggregatedList response = routerClient.aggregatedListRoutersCallable().call(request);
       for (RoutersScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.aggregatedListRoutersCallable))))

(defn get-router
  "Returns the specified Router resource. Gets a list of available routers by making a list()
   request.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectRegionRouterName router = ProjectRegionRouterName.of(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     Router response = routerClient.getRouter(router);
   }

  router - Name of the Router resource to return. - `com.google.cloud.compute.v1.ProjectRegionRouterName`

  returns: `com.google.cloud.compute.v1.Router`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Router [^RouterClient this ^com.google.cloud.compute.v1.ProjectRegionRouterName router]
    (-> this (.getRouter router))))

(defn insert-router
  "Creates a Router resource in the specified project and region using the data included in the
   request.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     Router routerResource = Router.newBuilder().build();
     Operation response = routerClient.insertRouter(region, routerResource);
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  router-resource - Router resource. - `com.google.cloud.compute.v1.Router`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RouterClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.Router router-resource]
    (-> this (.insertRouter region router-resource)))
  (^com.google.cloud.compute.v1.Operation [^RouterClient this ^com.google.cloud.compute.v1.InsertRouterHttpRequest request]
    (-> this (.insertRouter request))))

(defn aggregated-list-routers
  "Retrieves an aggregated list of routers.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (RoutersScopedList element : routerClient.aggregatedListRouters(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.RouterClient$AggregatedListRoutersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RouterClient$AggregatedListRoutersPagedResponse [^RouterClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListRouters project))))

(defn update-router
  "Updates the specified Router resource with the data included in the request.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectRegionRouterName router = ProjectRegionRouterName.of(\"[PROJECT]\", \"[REGION]\", \"[ROUTER]\");
     Router routerResource = Router.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = routerClient.updateRouter(router, routerResource, fieldMask);
   }

  router - Name of the Router resource to update. - `com.google.cloud.compute.v1.ProjectRegionRouterName`
  router-resource - Router resource. - `com.google.cloud.compute.v1.Router`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RouterClient this ^com.google.cloud.compute.v1.ProjectRegionRouterName router ^com.google.cloud.compute.v1.Router router-resource ^java.util.List field-mask]
    (-> this (.updateRouter router router-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^RouterClient this ^com.google.cloud.compute.v1.UpdateRouterHttpRequest request]
    (-> this (.updateRouter request))))

(defn list-routers
  "Retrieves a list of Router resources available to the specified project.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (Router element : routerClient.listRouters(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.RouterClient$ListRoutersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RouterClient$ListRoutersPagedResponse [^RouterClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listRouters region))))

(defn shutdown-now
  ""
  ([^RouterClient this]
    (-> this (.shutdownNow))))

(defn aggregated-list-routers-paged-callable
  "Retrieves an aggregated list of routers.

   Sample code:



   try (RouterClient routerClient = RouterClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListRoutersHttpRequest request = AggregatedListRoutersHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListRoutersPagedResponse> future = routerClient.aggregatedListRoutersPagedCallable().futureCall(request);
     // Do something
     for (RoutersScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterClient$AggregatedListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RouterClient this]
    (-> this (.aggregatedListRoutersPagedCallable))))


(ns com.google.cloud.compute.v1.TargetTcpProxyClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
    ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of(\"[PROJECT]\", \"[TARGET_TCP_PROXY]\");
    Operation response = targetTcpProxyClient.deleteTargetTcpProxy(targetTcpProxy);
  }

  Note: close() needs to be called on the targetTcpProxyClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of TargetTcpProxySettings to
  create(). For example:

  To customize credentials:



  TargetTcpProxySettings targetTcpProxySettings =
      TargetTcpProxySettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TargetTcpProxyClient targetTcpProxyClient =
      TargetTcpProxyClient.create(targetTcpProxySettings);

  To customize the endpoint:



  TargetTcpProxySettings targetTcpProxySettings =
      TargetTcpProxySettings.newBuilder().setEndpoint(myEndpoint).build();
  TargetTcpProxyClient targetTcpProxyClient =
      TargetTcpProxyClient.create(targetTcpProxySettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetTcpProxyClient]))

(defn *create
  "Constructs an instance of TargetTcpProxyClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.TargetTcpProxySettings`

  returns: `com.google.cloud.compute.v1.TargetTcpProxyClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetTcpProxyClient [^com.google.cloud.compute.v1.TargetTcpProxySettings settings]
    (TargetTcpProxyClient/create settings))
  (^com.google.cloud.compute.v1.TargetTcpProxyClient []
    (TargetTcpProxyClient/create )))

(defn list-target-tcp-proxies
  "Retrieves the list of TargetTcpProxy resources available to the specified project.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (TargetTcpProxy element : targetTcpProxyClient.listTargetTcpProxies(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.TargetTcpProxyClient$ListTargetTcpProxiesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetTcpProxyClient$ListTargetTcpProxiesPagedResponse [^TargetTcpProxyClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listTargetTcpProxies project))))

(defn list-target-tcp-proxies-callable
  "Retrieves the list of TargetTcpProxy resources available to the specified project.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListTargetTcpProxiesHttpRequest request = ListTargetTcpProxiesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       TargetTcpProxyList response = targetTcpProxyClient.listTargetTcpProxiesCallable().call(request);
       for (TargetTcpProxy element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyClient this]
    (-> this (.listTargetTcpProxiesCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.TargetTcpProxySettings`"
  (^com.google.cloud.compute.v1.TargetTcpProxySettings [^TargetTcpProxyClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetTcpProxyStub`"
  ([^TargetTcpProxyClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TargetTcpProxyClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TargetTcpProxyClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^TargetTcpProxyClient this]
    (-> this (.shutdown))))

(defn delete-target-tcp-proxy-callable
  "Deletes the specified TargetTcpProxy resource.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     String formattedTargetTcpProxy = ProjectGlobalTargetTcpProxyName.format(\"[PROJECT]\", \"[TARGET_TCP_PROXY]\");
     DeleteTargetTcpProxyHttpRequest request = DeleteTargetTcpProxyHttpRequest.newBuilder()
       .setTargetTcpProxy(formattedTargetTcpProxy)
       .build();
     ApiFuture<Operation> future = targetTcpProxyClient.deleteTargetTcpProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyClient this]
    (-> this (.deleteTargetTcpProxyCallable))))

(defn insert-target-tcp-proxy
  "Creates a TargetTcpProxy resource in the specified project using the data included in the
   request.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();
     Operation response = targetTcpProxyClient.insertTargetTcpProxy(project, targetTcpProxyResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  target-tcp-proxy-resource - A TargetTcpProxy resource. This resource defines a TCP proxy. (== resource_for beta.targetTcpProxies ==) (== resource_for v1.targetTcpProxies ==) - `com.google.cloud.compute.v1.TargetTcpProxy`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetTcpProxyClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.TargetTcpProxy target-tcp-proxy-resource]
    (-> this (.insertTargetTcpProxy project target-tcp-proxy-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetTcpProxyClient this ^com.google.cloud.compute.v1.InsertTargetTcpProxyHttpRequest request]
    (-> this (.insertTargetTcpProxy request))))

(defn set-backend-service-target-tcp-proxy
  "Changes the BackendService for TargetTcpProxy.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of(\"[PROJECT]\", \"[TARGET_TCP_PROXY]\");
     TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource = TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();
     Operation response = targetTcpProxyClient.setBackendServiceTargetTcpProxy(targetTcpProxy, targetTcpProxiesSetBackendServiceRequestResource);
   }

  target-tcp-proxy - Name of the TargetTcpProxy resource whose BackendService resource is to be set. - `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName`
  target-tcp-proxies-set-backend-service-request-resource - `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetTcpProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName target-tcp-proxy ^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest target-tcp-proxies-set-backend-service-request-resource]
    (-> this (.setBackendServiceTargetTcpProxy target-tcp-proxy target-tcp-proxies-set-backend-service-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetTcpProxyClient this ^com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyHttpRequest request]
    (-> this (.setBackendServiceTargetTcpProxy request))))

(defn insert-target-tcp-proxy-callable
  "Creates a TargetTcpProxy resource in the specified project using the data included in the
   request.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();
     InsertTargetTcpProxyHttpRequest request = InsertTargetTcpProxyHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setTargetTcpProxyResource(targetTcpProxyResource)
       .build();
     ApiFuture<Operation> future = targetTcpProxyClient.insertTargetTcpProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyClient this]
    (-> this (.insertTargetTcpProxyCallable))))

(defn close
  ""
  ([^TargetTcpProxyClient this]
    (-> this (.close))))

(defn get-target-tcp-proxy
  "Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by
   making a list() request.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of(\"[PROJECT]\", \"[TARGET_TCP_PROXY]\");
     TargetTcpProxy response = targetTcpProxyClient.getTargetTcpProxy(targetTcpProxy);
   }

  target-tcp-proxy - Name of the TargetTcpProxy resource to return. - `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetTcpProxy [^TargetTcpProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName target-tcp-proxy]
    (-> this (.getTargetTcpProxy target-tcp-proxy))))

(defn delete-target-tcp-proxy
  "Deletes the specified TargetTcpProxy resource.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of(\"[PROJECT]\", \"[TARGET_TCP_PROXY]\");
     Operation response = targetTcpProxyClient.deleteTargetTcpProxy(targetTcpProxy);
   }

  target-tcp-proxy - Name of the TargetTcpProxy resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetTcpProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName target-tcp-proxy]
    (-> this (.deleteTargetTcpProxy target-tcp-proxy))))

(defn set-proxy-header-target-tcp-proxy
  "Changes the ProxyHeaderType for TargetTcpProxy.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of(\"[PROJECT]\", \"[TARGET_TCP_PROXY]\");
     TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource = TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();
     Operation response = targetTcpProxyClient.setProxyHeaderTargetTcpProxy(targetTcpProxy, targetTcpProxiesSetProxyHeaderRequestResource);
   }

  target-tcp-proxy - Name of the TargetTcpProxy resource whose ProxyHeader is to be set. - `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName`
  target-tcp-proxies-set-proxy-header-request-resource - `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetTcpProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName target-tcp-proxy ^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest target-tcp-proxies-set-proxy-header-request-resource]
    (-> this (.setProxyHeaderTargetTcpProxy target-tcp-proxy target-tcp-proxies-set-proxy-header-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetTcpProxyClient this ^com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyHttpRequest request]
    (-> this (.setProxyHeaderTargetTcpProxy request))))

(defn set-backend-service-target-tcp-proxy-callable
  "Changes the BackendService for TargetTcpProxy.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     String formattedTargetTcpProxy = ProjectGlobalTargetTcpProxyName.format(\"[PROJECT]\", \"[TARGET_TCP_PROXY]\");
     TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource = TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();
     SetBackendServiceTargetTcpProxyHttpRequest request = SetBackendServiceTargetTcpProxyHttpRequest.newBuilder()
       .setTargetTcpProxy(formattedTargetTcpProxy)
       .setTargetTcpProxiesSetBackendServiceRequestResource(targetTcpProxiesSetBackendServiceRequestResource)
       .build();
     ApiFuture<Operation> future = targetTcpProxyClient.setBackendServiceTargetTcpProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyClient this]
    (-> this (.setBackendServiceTargetTcpProxyCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TargetTcpProxyClient this]
    (-> this (.isTerminated))))

(defn get-target-tcp-proxy-callable
  "Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by
   making a list() request.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     String formattedTargetTcpProxy = ProjectGlobalTargetTcpProxyName.format(\"[PROJECT]\", \"[TARGET_TCP_PROXY]\");
     GetTargetTcpProxyHttpRequest request = GetTargetTcpProxyHttpRequest.newBuilder()
       .setTargetTcpProxy(formattedTargetTcpProxy)
       .build();
     ApiFuture<TargetTcpProxy> future = targetTcpProxyClient.getTargetTcpProxyCallable().futureCall(request);
     // Do something
     TargetTcpProxy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.TargetTcpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyClient this]
    (-> this (.getTargetTcpProxyCallable))))

(defn list-target-tcp-proxies-paged-callable
  "Retrieves the list of TargetTcpProxy resources available to the specified project.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListTargetTcpProxiesHttpRequest request = ListTargetTcpProxiesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListTargetTcpProxiesPagedResponse> future = targetTcpProxyClient.listTargetTcpProxiesPagedCallable().futureCall(request);
     // Do something
     for (TargetTcpProxy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyClient$ListTargetTcpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyClient this]
    (-> this (.listTargetTcpProxiesPagedCallable))))

(defn shutdown-now
  ""
  ([^TargetTcpProxyClient this]
    (-> this (.shutdownNow))))

(defn set-proxy-header-target-tcp-proxy-callable
  "Changes the ProxyHeaderType for TargetTcpProxy.

   Sample code:



   try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
     String formattedTargetTcpProxy = ProjectGlobalTargetTcpProxyName.format(\"[PROJECT]\", \"[TARGET_TCP_PROXY]\");
     TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource = TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();
     SetProxyHeaderTargetTcpProxyHttpRequest request = SetProxyHeaderTargetTcpProxyHttpRequest.newBuilder()
       .setTargetTcpProxy(formattedTargetTcpProxy)
       .setTargetTcpProxiesSetProxyHeaderRequestResource(targetTcpProxiesSetProxyHeaderRequestResource)
       .build();
     ApiFuture<Operation> future = targetTcpProxyClient.setProxyHeaderTargetTcpProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyClient this]
    (-> this (.setProxyHeaderTargetTcpProxyCallable))))


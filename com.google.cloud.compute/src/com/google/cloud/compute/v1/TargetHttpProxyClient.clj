(ns com.google.cloud.compute.v1.TargetHttpProxyClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
    ProjectGlobalTargetHttpProxyName targetHttpProxy = ProjectGlobalTargetHttpProxyName.of(\"[PROJECT]\", \"[TARGET_HTTP_PROXY]\");
    Operation response = targetHttpProxyClient.deleteTargetHttpProxy(targetHttpProxy);
  }

  Note: close() needs to be called on the targetHttpProxyClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

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

  This class can be customized by passing in a custom instance of TargetHttpProxySettings to
  create(). For example:

  To customize credentials:



  TargetHttpProxySettings targetHttpProxySettings =
      TargetHttpProxySettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TargetHttpProxyClient targetHttpProxyClient =
      TargetHttpProxyClient.create(targetHttpProxySettings);

  To customize the endpoint:



  TargetHttpProxySettings targetHttpProxySettings =
      TargetHttpProxySettings.newBuilder().setEndpoint(myEndpoint).build();
  TargetHttpProxyClient targetHttpProxyClient =
      TargetHttpProxyClient.create(targetHttpProxySettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpProxyClient]))

(defn *create
  "Constructs an instance of TargetHttpProxyClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.TargetHttpProxySettings`

  returns: `com.google.cloud.compute.v1.TargetHttpProxyClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetHttpProxyClient [^com.google.cloud.compute.v1.TargetHttpProxySettings settings]
    (TargetHttpProxyClient/create settings))
  (^com.google.cloud.compute.v1.TargetHttpProxyClient []
    (TargetHttpProxyClient/create )))

(defn get-target-http-proxy
  "Returns the specified TargetHttpProxy resource. Gets a list of available target HTTP proxies by
   making a list() request.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     ProjectGlobalTargetHttpProxyName targetHttpProxy = ProjectGlobalTargetHttpProxyName.of(\"[PROJECT]\", \"[TARGET_HTTP_PROXY]\");
     TargetHttpProxy response = targetHttpProxyClient.getTargetHttpProxy(targetHttpProxy);
   }

  target-http-proxy - Name of the TargetHttpProxy resource to return. - `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetHttpProxy [^TargetHttpProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName target-http-proxy]
    (-> this (.getTargetHttpProxy target-http-proxy))))

(defn insert-target-http-proxy-callable
  "Creates a TargetHttpProxy resource in the specified project using the data included in the
   request.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     TargetHttpProxy targetHttpProxyResource = TargetHttpProxy.newBuilder().build();
     InsertTargetHttpProxyHttpRequest request = InsertTargetHttpProxyHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setTargetHttpProxyResource(targetHttpProxyResource)
       .build();
     ApiFuture<Operation> future = targetHttpProxyClient.insertTargetHttpProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyClient this]
    (-> this (.insertTargetHttpProxyCallable))))

(defn list-target-http-proxies-callable
  "Retrieves the list of TargetHttpProxy resources available to the specified project.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListTargetHttpProxiesHttpRequest request = ListTargetHttpProxiesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       TargetHttpProxyList response = targetHttpProxyClient.listTargetHttpProxiesCallable().call(request);
       for (TargetHttpProxy element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyClient this]
    (-> this (.listTargetHttpProxiesCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.TargetHttpProxySettings`"
  (^com.google.cloud.compute.v1.TargetHttpProxySettings [^TargetHttpProxyClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetHttpProxyStub`"
  ([^TargetHttpProxyClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TargetHttpProxyClient this]
    (-> this (.isShutdown))))

(defn delete-target-http-proxy
  "Deletes the specified TargetHttpProxy resource.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     ProjectGlobalTargetHttpProxyName targetHttpProxy = ProjectGlobalTargetHttpProxyName.of(\"[PROJECT]\", \"[TARGET_HTTP_PROXY]\");
     Operation response = targetHttpProxyClient.deleteTargetHttpProxy(targetHttpProxy);
   }

  target-http-proxy - Name of the TargetHttpProxy resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetHttpProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName target-http-proxy]
    (-> this (.deleteTargetHttpProxy target-http-proxy))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TargetHttpProxyClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-target-http-proxies-paged-callable
  "Retrieves the list of TargetHttpProxy resources available to the specified project.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListTargetHttpProxiesHttpRequest request = ListTargetHttpProxiesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListTargetHttpProxiesPagedResponse> future = targetHttpProxyClient.listTargetHttpProxiesPagedCallable().futureCall(request);
     // Do something
     for (TargetHttpProxy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpProxyClient$ListTargetHttpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyClient this]
    (-> this (.listTargetHttpProxiesPagedCallable))))

(defn shutdown
  ""
  ([^TargetHttpProxyClient this]
    (-> this (.shutdown))))

(defn get-target-http-proxy-callable
  "Returns the specified TargetHttpProxy resource. Gets a list of available target HTTP proxies by
   making a list() request.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     String formattedTargetHttpProxy = ProjectGlobalTargetHttpProxyName.format(\"[PROJECT]\", \"[TARGET_HTTP_PROXY]\");
     GetTargetHttpProxyHttpRequest request = GetTargetHttpProxyHttpRequest.newBuilder()
       .setTargetHttpProxy(formattedTargetHttpProxy)
       .build();
     ApiFuture<TargetHttpProxy> future = targetHttpProxyClient.getTargetHttpProxyCallable().futureCall(request);
     // Do something
     TargetHttpProxy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyClient this]
    (-> this (.getTargetHttpProxyCallable))))

(defn set-url-map-target-http-proxy
  "Changes the URL map for TargetHttpProxy.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     ProjectTargetHttpProxyName targetHttpProxy = ProjectTargetHttpProxyName.of(\"[PROJECT]\", \"[TARGET_HTTP_PROXY]\");
     UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
     Operation response = targetHttpProxyClient.setUrlMapTargetHttpProxy(targetHttpProxy, urlMapReferenceResource);
   }

  target-http-proxy - Name of the TargetHttpProxy to set a URL map for. - `com.google.cloud.compute.v1.ProjectTargetHttpProxyName`
  url-map-reference-resource - `com.google.cloud.compute.v1.UrlMapReference`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetHttpProxyClient this ^com.google.cloud.compute.v1.ProjectTargetHttpProxyName target-http-proxy ^com.google.cloud.compute.v1.UrlMapReference url-map-reference-resource]
    (-> this (.setUrlMapTargetHttpProxy target-http-proxy url-map-reference-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetHttpProxyClient this ^com.google.cloud.compute.v1.SetUrlMapTargetHttpProxyHttpRequest request]
    (-> this (.setUrlMapTargetHttpProxy request))))

(defn close
  ""
  ([^TargetHttpProxyClient this]
    (-> this (.close))))

(defn insert-target-http-proxy
  "Creates a TargetHttpProxy resource in the specified project using the data included in the
   request.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     TargetHttpProxy targetHttpProxyResource = TargetHttpProxy.newBuilder().build();
     Operation response = targetHttpProxyClient.insertTargetHttpProxy(project, targetHttpProxyResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  target-http-proxy-resource - A TargetHttpProxy resource. This resource defines an HTTP proxy. (== resource_for beta.targetHttpProxies ==) (== resource_for v1.targetHttpProxies ==) - `com.google.cloud.compute.v1.TargetHttpProxy`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetHttpProxyClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.TargetHttpProxy target-http-proxy-resource]
    (-> this (.insertTargetHttpProxy project target-http-proxy-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetHttpProxyClient this ^com.google.cloud.compute.v1.InsertTargetHttpProxyHttpRequest request]
    (-> this (.insertTargetHttpProxy request))))

(defn list-target-http-proxies
  "Retrieves the list of TargetHttpProxy resources available to the specified project.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (TargetHttpProxy element : targetHttpProxyClient.listTargetHttpProxies(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.TargetHttpProxyClient$ListTargetHttpProxiesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetHttpProxyClient$ListTargetHttpProxiesPagedResponse [^TargetHttpProxyClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listTargetHttpProxies project))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TargetHttpProxyClient this]
    (-> this (.isTerminated))))

(defn delete-target-http-proxy-callable
  "Deletes the specified TargetHttpProxy resource.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     String formattedTargetHttpProxy = ProjectGlobalTargetHttpProxyName.format(\"[PROJECT]\", \"[TARGET_HTTP_PROXY]\");
     DeleteTargetHttpProxyHttpRequest request = DeleteTargetHttpProxyHttpRequest.newBuilder()
       .setTargetHttpProxy(formattedTargetHttpProxy)
       .build();
     ApiFuture<Operation> future = targetHttpProxyClient.deleteTargetHttpProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyClient this]
    (-> this (.deleteTargetHttpProxyCallable))))

(defn set-url-map-target-http-proxy-callable
  "Changes the URL map for TargetHttpProxy.

   Sample code:



   try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
     String formattedTargetHttpProxy = ProjectTargetHttpProxyName.format(\"[PROJECT]\", \"[TARGET_HTTP_PROXY]\");
     UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
     SetUrlMapTargetHttpProxyHttpRequest request = SetUrlMapTargetHttpProxyHttpRequest.newBuilder()
       .setTargetHttpProxy(formattedTargetHttpProxy)
       .setUrlMapReferenceResource(urlMapReferenceResource)
       .build();
     ApiFuture<Operation> future = targetHttpProxyClient.setUrlMapTargetHttpProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetUrlMapTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyClient this]
    (-> this (.setUrlMapTargetHttpProxyCallable))))

(defn shutdown-now
  ""
  ([^TargetHttpProxyClient this]
    (-> this (.shutdownNow))))


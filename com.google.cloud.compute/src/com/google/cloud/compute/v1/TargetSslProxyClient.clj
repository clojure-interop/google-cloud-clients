(ns com.google.cloud.compute.v1.TargetSslProxyClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
    ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
    Operation response = targetSslProxyClient.deleteTargetSslProxy(targetSslProxy);
  }

  Note: close() needs to be called on the targetSslProxyClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of TargetSslProxySettings to
  create(). For example:

  To customize credentials:



  TargetSslProxySettings targetSslProxySettings =
      TargetSslProxySettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TargetSslProxyClient targetSslProxyClient =
      TargetSslProxyClient.create(targetSslProxySettings);

  To customize the endpoint:



  TargetSslProxySettings targetSslProxySettings =
      TargetSslProxySettings.newBuilder().setEndpoint(myEndpoint).build();
  TargetSslProxyClient targetSslProxyClient =
      TargetSslProxyClient.create(targetSslProxySettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetSslProxyClient]))

(defn *create
  "Constructs an instance of TargetSslProxyClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.TargetSslProxySettings`

  returns: `com.google.cloud.compute.v1.TargetSslProxyClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetSslProxyClient [^com.google.cloud.compute.v1.TargetSslProxySettings settings]
    (TargetSslProxyClient/create settings))
  (^com.google.cloud.compute.v1.TargetSslProxyClient []
    (TargetSslProxyClient/create )))

(defn set-ssl-certificates-target-ssl-proxy-callable
  "Changes SslCertificates for TargetSslProxy.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     String formattedTargetSslProxy = ProjectGlobalTargetSslProxyName.format(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequestResource = TargetSslProxiesSetSslCertificatesRequest.newBuilder().build();
     SetSslCertificatesTargetSslProxyHttpRequest request = SetSslCertificatesTargetSslProxyHttpRequest.newBuilder()
       .setTargetSslProxy(formattedTargetSslProxy)
       .setTargetSslProxiesSetSslCertificatesRequestResource(targetSslProxiesSetSslCertificatesRequestResource)
       .build();
     ApiFuture<Operation> future = targetSslProxyClient.setSslCertificatesTargetSslProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyClient this]
    (-> this (.setSslCertificatesTargetSslProxyCallable))))

(defn list-target-ssl-proxies
  "Retrieves the list of TargetSslProxy resources available to the specified project.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (TargetSslProxy element : targetSslProxyClient.listTargetSslProxies(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.TargetSslProxyClient$ListTargetSslProxiesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetSslProxyClient$ListTargetSslProxiesPagedResponse [^TargetSslProxyClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listTargetSslProxies project))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.TargetSslProxySettings`"
  (^com.google.cloud.compute.v1.TargetSslProxySettings [^TargetSslProxyClient this]
    (-> this (.getSettings))))

(defn insert-target-ssl-proxy
  "Creates a TargetSslProxy resource in the specified project using the data included in the
   request.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     TargetSslProxy targetSslProxyResource = TargetSslProxy.newBuilder().build();
     Operation response = targetSslProxyClient.insertTargetSslProxy(project, targetSslProxyResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  target-ssl-proxy-resource - A TargetSslProxy resource. This resource defines an SSL proxy. (== resource_for beta.targetSslProxies ==) (== resource_for v1.targetSslProxies ==) - `com.google.cloud.compute.v1.TargetSslProxy`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.TargetSslProxy target-ssl-proxy-resource]
    (-> this (.insertTargetSslProxy project target-ssl-proxy-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest request]
    (-> this (.insertTargetSslProxy request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetSslProxyStub`"
  ([^TargetSslProxyClient this]
    (-> this (.getStub))))

(defn set-ssl-policy-target-ssl-proxy
  "Sets the SSL policy for TargetSslProxy. The SSL policy specifies the server-side support for
   SSL features. This affects connections between clients and the SSL proxy load balancer. They do
   not affect the connection between the load balancer and the backends.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
     Operation response = targetSslProxyClient.setSslPolicyTargetSslProxy(targetSslProxy, sslPolicyReferenceResource);
   }

  target-ssl-proxy - Name of the TargetSslProxy resource whose SSL policy is to be set. The name must be 1-63 characters long, and comply with RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`
  ssl-policy-reference-resource - `com.google.cloud.compute.v1.SslPolicyReference`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName target-ssl-proxy ^com.google.cloud.compute.v1.SslPolicyReference ssl-policy-reference-resource]
    (-> this (.setSslPolicyTargetSslProxy target-ssl-proxy ssl-policy-reference-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest request]
    (-> this (.setSslPolicyTargetSslProxy request))))

(defn set-ssl-policy-target-ssl-proxy-callable
  "Sets the SSL policy for TargetSslProxy. The SSL policy specifies the server-side support for
   SSL features. This affects connections between clients and the SSL proxy load balancer. They do
   not affect the connection between the load balancer and the backends.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     String formattedTargetSslProxy = ProjectGlobalTargetSslProxyName.format(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
     SetSslPolicyTargetSslProxyHttpRequest request = SetSslPolicyTargetSslProxyHttpRequest.newBuilder()
       .setTargetSslProxy(formattedTargetSslProxy)
       .setSslPolicyReferenceResource(sslPolicyReferenceResource)
       .build();
     ApiFuture<Operation> future = targetSslProxyClient.setSslPolicyTargetSslProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyClient this]
    (-> this (.setSslPolicyTargetSslProxyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TargetSslProxyClient this]
    (-> this (.isShutdown))))

(defn set-ssl-certificates-target-ssl-proxy
  "Changes SslCertificates for TargetSslProxy.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequestResource = TargetSslProxiesSetSslCertificatesRequest.newBuilder().build();
     Operation response = targetSslProxyClient.setSslCertificatesTargetSslProxy(targetSslProxy, targetSslProxiesSetSslCertificatesRequestResource);
   }

  target-ssl-proxy - Name of the TargetSslProxy resource whose SslCertificate resource is to be set. - `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`
  target-ssl-proxies-set-ssl-certificates-request-resource - `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName target-ssl-proxy ^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest target-ssl-proxies-set-ssl-certificates-request-resource]
    (-> this (.setSslCertificatesTargetSslProxy target-ssl-proxy target-ssl-proxies-set-ssl-certificates-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest request]
    (-> this (.setSslCertificatesTargetSslProxy request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TargetSslProxyClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn insert-target-ssl-proxy-callable
  "Creates a TargetSslProxy resource in the specified project using the data included in the
   request.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     TargetSslProxy targetSslProxyResource = TargetSslProxy.newBuilder().build();
     InsertTargetSslProxyHttpRequest request = InsertTargetSslProxyHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setTargetSslProxyResource(targetSslProxyResource)
       .build();
     ApiFuture<Operation> future = targetSslProxyClient.insertTargetSslProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyClient this]
    (-> this (.insertTargetSslProxyCallable))))

(defn delete-target-ssl-proxy-callable
  "Deletes the specified TargetSslProxy resource.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     String formattedTargetSslProxy = ProjectGlobalTargetSslProxyName.format(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     DeleteTargetSslProxyHttpRequest request = DeleteTargetSslProxyHttpRequest.newBuilder()
       .setTargetSslProxy(formattedTargetSslProxy)
       .build();
     ApiFuture<Operation> future = targetSslProxyClient.deleteTargetSslProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyClient this]
    (-> this (.deleteTargetSslProxyCallable))))

(defn list-target-ssl-proxies-callable
  "Retrieves the list of TargetSslProxy resources available to the specified project.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListTargetSslProxiesHttpRequest request = ListTargetSslProxiesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       TargetSslProxyList response = targetSslProxyClient.listTargetSslProxiesCallable().call(request);
       for (TargetSslProxy element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyClient this]
    (-> this (.listTargetSslProxiesCallable))))

(defn shutdown
  ""
  ([^TargetSslProxyClient this]
    (-> this (.shutdown))))

(defn list-target-ssl-proxies-paged-callable
  "Retrieves the list of TargetSslProxy resources available to the specified project.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListTargetSslProxiesHttpRequest request = ListTargetSslProxiesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListTargetSslProxiesPagedResponse> future = targetSslProxyClient.listTargetSslProxiesPagedCallable().futureCall(request);
     // Do something
     for (TargetSslProxy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyClient$ListTargetSslProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyClient this]
    (-> this (.listTargetSslProxiesPagedCallable))))

(defn set-proxy-header-target-ssl-proxy
  "Changes the ProxyHeaderType for TargetSslProxy.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequestResource = TargetSslProxiesSetProxyHeaderRequest.newBuilder().build();
     Operation response = targetSslProxyClient.setProxyHeaderTargetSslProxy(targetSslProxy, targetSslProxiesSetProxyHeaderRequestResource);
   }

  target-ssl-proxy - Name of the TargetSslProxy resource whose ProxyHeader is to be set. - `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`
  target-ssl-proxies-set-proxy-header-request-resource - `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName target-ssl-proxy ^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest target-ssl-proxies-set-proxy-header-request-resource]
    (-> this (.setProxyHeaderTargetSslProxy target-ssl-proxy target-ssl-proxies-set-proxy-header-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest request]
    (-> this (.setProxyHeaderTargetSslProxy request))))

(defn close
  ""
  ([^TargetSslProxyClient this]
    (-> this (.close))))

(defn get-target-ssl-proxy
  "Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by
   making a list() request.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     TargetSslProxy response = targetSslProxyClient.getTargetSslProxy(targetSslProxy);
   }

  target-ssl-proxy - Name of the TargetSslProxy resource to return. - `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`

  returns: `com.google.cloud.compute.v1.TargetSslProxy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetSslProxy [^TargetSslProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName target-ssl-proxy]
    (-> this (.getTargetSslProxy target-ssl-proxy))))

(defn delete-target-ssl-proxy
  "Deletes the specified TargetSslProxy resource.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     Operation response = targetSslProxyClient.deleteTargetSslProxy(targetSslProxy);
   }

  target-ssl-proxy - Name of the TargetSslProxy resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName target-ssl-proxy]
    (-> this (.deleteTargetSslProxy target-ssl-proxy))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TargetSslProxyClient this]
    (-> this (.isTerminated))))

(defn set-proxy-header-target-ssl-proxy-callable
  "Changes the ProxyHeaderType for TargetSslProxy.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     String formattedTargetSslProxy = ProjectGlobalTargetSslProxyName.format(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequestResource = TargetSslProxiesSetProxyHeaderRequest.newBuilder().build();
     SetProxyHeaderTargetSslProxyHttpRequest request = SetProxyHeaderTargetSslProxyHttpRequest.newBuilder()
       .setTargetSslProxy(formattedTargetSslProxy)
       .setTargetSslProxiesSetProxyHeaderRequestResource(targetSslProxiesSetProxyHeaderRequestResource)
       .build();
     ApiFuture<Operation> future = targetSslProxyClient.setProxyHeaderTargetSslProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyClient this]
    (-> this (.setProxyHeaderTargetSslProxyCallable))))

(defn shutdown-now
  ""
  ([^TargetSslProxyClient this]
    (-> this (.shutdownNow))))

(defn set-backend-service-target-ssl-proxy-callable
  "Changes the BackendService for TargetSslProxy.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     String formattedTargetSslProxy = ProjectGlobalTargetSslProxyName.format(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequestResource = TargetSslProxiesSetBackendServiceRequest.newBuilder().build();
     SetBackendServiceTargetSslProxyHttpRequest request = SetBackendServiceTargetSslProxyHttpRequest.newBuilder()
       .setTargetSslProxy(formattedTargetSslProxy)
       .setTargetSslProxiesSetBackendServiceRequestResource(targetSslProxiesSetBackendServiceRequestResource)
       .build();
     ApiFuture<Operation> future = targetSslProxyClient.setBackendServiceTargetSslProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyClient this]
    (-> this (.setBackendServiceTargetSslProxyCallable))))

(defn set-backend-service-target-ssl-proxy
  "Changes the BackendService for TargetSslProxy.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequestResource = TargetSslProxiesSetBackendServiceRequest.newBuilder().build();
     Operation response = targetSslProxyClient.setBackendServiceTargetSslProxy(targetSslProxy, targetSslProxiesSetBackendServiceRequestResource);
   }

  target-ssl-proxy - Name of the TargetSslProxy resource whose BackendService resource is to be set. - `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`
  target-ssl-proxies-set-backend-service-request-resource - `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName target-ssl-proxy ^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest target-ssl-proxies-set-backend-service-request-resource]
    (-> this (.setBackendServiceTargetSslProxy target-ssl-proxy target-ssl-proxies-set-backend-service-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetSslProxyClient this ^com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest request]
    (-> this (.setBackendServiceTargetSslProxy request))))

(defn get-target-ssl-proxy-callable
  "Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by
   making a list() request.

   Sample code:



   try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
     String formattedTargetSslProxy = ProjectGlobalTargetSslProxyName.format(\"[PROJECT]\", \"[TARGET_SSL_PROXY]\");
     GetTargetSslProxyHttpRequest request = GetTargetSslProxyHttpRequest.newBuilder()
       .setTargetSslProxy(formattedTargetSslProxy)
       .build();
     ApiFuture<TargetSslProxy> future = targetSslProxyClient.getTargetSslProxyCallable().futureCall(request);
     // Do something
     TargetSslProxy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetSslProxyHttpRequest,com.google.cloud.compute.v1.TargetSslProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyClient this]
    (-> this (.getTargetSslProxyCallable))))


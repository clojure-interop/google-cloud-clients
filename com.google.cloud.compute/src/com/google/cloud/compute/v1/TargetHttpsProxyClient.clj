(ns com.google.cloud.compute.v1.TargetHttpsProxyClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
    ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
    Operation response = targetHttpsProxyClient.deleteTargetHttpsProxy(targetHttpsProxy);
  }

  Note: close() needs to be called on the targetHttpsProxyClient object to clean up resources
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

  This class can be customized by passing in a custom instance of TargetHttpsProxySettings to
  create(). For example:

  To customize credentials:



  TargetHttpsProxySettings targetHttpsProxySettings =
      TargetHttpsProxySettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TargetHttpsProxyClient targetHttpsProxyClient =
      TargetHttpsProxyClient.create(targetHttpsProxySettings);

  To customize the endpoint:



  TargetHttpsProxySettings targetHttpsProxySettings =
      TargetHttpsProxySettings.newBuilder().setEndpoint(myEndpoint).build();
  TargetHttpsProxyClient targetHttpsProxyClient =
      TargetHttpsProxyClient.create(targetHttpsProxySettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpsProxyClient]))

(defn *create
  "Constructs an instance of TargetHttpsProxyClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.TargetHttpsProxySettings`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxyClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetHttpsProxyClient [^com.google.cloud.compute.v1.TargetHttpsProxySettings settings]
    (TargetHttpsProxyClient/create settings))
  (^com.google.cloud.compute.v1.TargetHttpsProxyClient []
    (TargetHttpsProxyClient/create )))

(defn set-quic-override-target-https-proxy-callable
  "Sets the QUIC override policy for TargetHttpsProxy.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     String formattedTargetHttpsProxy = ProjectGlobalTargetHttpsProxyName.format(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource = TargetHttpsProxiesSetQuicOverrideRequest.newBuilder().build();
     SetQuicOverrideTargetHttpsProxyHttpRequest request = SetQuicOverrideTargetHttpsProxyHttpRequest.newBuilder()
       .setTargetHttpsProxy(formattedTargetHttpsProxy)
       .setTargetHttpsProxiesSetQuicOverrideRequestResource(targetHttpsProxiesSetQuicOverrideRequestResource)
       .build();
     ApiFuture<Operation> future = targetHttpsProxyClient.setQuicOverrideTargetHttpsProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyClient this]
    (-> this (.setQuicOverrideTargetHttpsProxyCallable))))

(defn set-ssl-policy-target-https-proxy
  "Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies the server-side support for
   SSL features. This affects connections between clients and the HTTPS proxy load balancer. They
   do not affect the connection between the load balancer and the backends.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
     Operation response = targetHttpsProxyClient.setSslPolicyTargetHttpsProxy(targetHttpsProxy, sslPolicyReferenceResource);
   }

  target-https-proxy - Name of the TargetHttpsProxy resource whose SSL policy is to be set. The name must be 1-63 characters long, and comply with RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName`
  ssl-policy-reference-resource - `com.google.cloud.compute.v1.SslPolicyReference`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName target-https-proxy ^com.google.cloud.compute.v1.SslPolicyReference ssl-policy-reference-resource]
    (-> this (.setSslPolicyTargetHttpsProxy target-https-proxy ssl-policy-reference-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.SetSslPolicyTargetHttpsProxyHttpRequest request]
    (-> this (.setSslPolicyTargetHttpsProxy request))))

(defn list-target-https-proxies
  "Retrieves the list of TargetHttpsProxy resources available to the specified project.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (TargetHttpsProxy element : targetHttpsProxyClient.listTargetHttpsProxies(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxyClient$ListTargetHttpsProxiesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetHttpsProxyClient$ListTargetHttpsProxiesPagedResponse [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listTargetHttpsProxies project))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxySettings`"
  (^com.google.cloud.compute.v1.TargetHttpsProxySettings [^TargetHttpsProxyClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetHttpsProxyStub`"
  ([^TargetHttpsProxyClient this]
    (-> this (.getStub))))

(defn delete-target-https-proxy
  "Deletes the specified TargetHttpsProxy resource.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     Operation response = targetHttpsProxyClient.deleteTargetHttpsProxy(targetHttpsProxy);
   }

  target-https-proxy - Name of the TargetHttpsProxy resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName target-https-proxy]
    (-> this (.deleteTargetHttpsProxy target-https-proxy))))

(defn insert-target-https-proxy
  "Creates a TargetHttpsProxy resource in the specified project using the data included in the
   request.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     TargetHttpsProxy targetHttpsProxyResource = TargetHttpsProxy.newBuilder().build();
     Operation response = targetHttpsProxyClient.insertTargetHttpsProxy(project, targetHttpsProxyResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  target-https-proxy-resource - A TargetHttpsProxy resource. This resource defines an HTTPS proxy. (== resource_for beta.targetHttpsProxies ==) (== resource_for v1.targetHttpsProxies ==) - `com.google.cloud.compute.v1.TargetHttpsProxy`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.TargetHttpsProxy target-https-proxy-resource]
    (-> this (.insertTargetHttpsProxy project target-https-proxy-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.InsertTargetHttpsProxyHttpRequest request]
    (-> this (.insertTargetHttpsProxy request))))

(defn set-url-map-target-https-proxy
  "Changes the URL map for TargetHttpsProxy.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
     Operation response = targetHttpsProxyClient.setUrlMapTargetHttpsProxy(targetHttpsProxy, urlMapReferenceResource);
   }

  target-https-proxy - Name of the TargetHttpsProxy resource whose URL map is to be set. - `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName`
  url-map-reference-resource - `com.google.cloud.compute.v1.UrlMapReference`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName target-https-proxy ^com.google.cloud.compute.v1.UrlMapReference url-map-reference-resource]
    (-> this (.setUrlMapTargetHttpsProxy target-https-proxy url-map-reference-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest request]
    (-> this (.setUrlMapTargetHttpsProxy request))))

(defn set-url-map-target-https-proxy-callable
  "Changes the URL map for TargetHttpsProxy.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     String formattedTargetHttpsProxy = ProjectTargetHttpsProxyName.format(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
     SetUrlMapTargetHttpsProxyHttpRequest request = SetUrlMapTargetHttpsProxyHttpRequest.newBuilder()
       .setTargetHttpsProxy(formattedTargetHttpsProxy)
       .setUrlMapReferenceResource(urlMapReferenceResource)
       .build();
     ApiFuture<Operation> future = targetHttpsProxyClient.setUrlMapTargetHttpsProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyClient this]
    (-> this (.setUrlMapTargetHttpsProxyCallable))))

(defn set-ssl-certificates-target-https-proxy
  "Replaces SslCertificates for TargetHttpsProxy.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequestResource = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
     Operation response = targetHttpsProxyClient.setSslCertificatesTargetHttpsProxy(targetHttpsProxy, targetHttpsProxiesSetSslCertificatesRequestResource);
   }

  target-https-proxy - Name of the TargetHttpsProxy resource to set an SslCertificates resource for. - `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName`
  target-https-proxies-set-ssl-certificates-request-resource - `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName target-https-proxy ^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest target-https-proxies-set-ssl-certificates-request-resource]
    (-> this (.setSslCertificatesTargetHttpsProxy target-https-proxy target-https-proxies-set-ssl-certificates-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest request]
    (-> this (.setSslCertificatesTargetHttpsProxy request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TargetHttpsProxyClient this]
    (-> this (.isShutdown))))

(defn list-target-https-proxies-callable
  "Retrieves the list of TargetHttpsProxy resources available to the specified project.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListTargetHttpsProxiesHttpRequest request = ListTargetHttpsProxiesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       TargetHttpsProxyList response = targetHttpsProxyClient.listTargetHttpsProxiesCallable().call(request);
       for (TargetHttpsProxy element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyClient this]
    (-> this (.listTargetHttpsProxiesCallable))))

(defn get-target-https-proxy
  "Returns the specified TargetHttpsProxy resource. Gets a list of available target HTTPS proxies
   by making a list() request.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     TargetHttpsProxy response = targetHttpsProxyClient.getTargetHttpsProxy(targetHttpsProxy);
   }

  target-https-proxy - Name of the TargetHttpsProxy resource to return. - `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetHttpsProxy [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName target-https-proxy]
    (-> this (.getTargetHttpsProxy target-https-proxy))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TargetHttpsProxyClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^TargetHttpsProxyClient this]
    (-> this (.shutdown))))

(defn set-ssl-policy-target-https-proxy-callable
  "Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies the server-side support for
   SSL features. This affects connections between clients and the HTTPS proxy load balancer. They
   do not affect the connection between the load balancer and the backends.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     String formattedTargetHttpsProxy = ProjectGlobalTargetHttpsProxyName.format(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
     SetSslPolicyTargetHttpsProxyHttpRequest request = SetSslPolicyTargetHttpsProxyHttpRequest.newBuilder()
       .setTargetHttpsProxy(formattedTargetHttpsProxy)
       .setSslPolicyReferenceResource(sslPolicyReferenceResource)
       .build();
     ApiFuture<Operation> future = targetHttpsProxyClient.setSslPolicyTargetHttpsProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslPolicyTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyClient this]
    (-> this (.setSslPolicyTargetHttpsProxyCallable))))

(defn insert-target-https-proxy-callable
  "Creates a TargetHttpsProxy resource in the specified project using the data included in the
   request.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     TargetHttpsProxy targetHttpsProxyResource = TargetHttpsProxy.newBuilder().build();
     InsertTargetHttpsProxyHttpRequest request = InsertTargetHttpsProxyHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setTargetHttpsProxyResource(targetHttpsProxyResource)
       .build();
     ApiFuture<Operation> future = targetHttpsProxyClient.insertTargetHttpsProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyClient this]
    (-> this (.insertTargetHttpsProxyCallable))))

(defn close
  ""
  ([^TargetHttpsProxyClient this]
    (-> this (.close))))

(defn set-quic-override-target-https-proxy
  "Sets the QUIC override policy for TargetHttpsProxy.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource = TargetHttpsProxiesSetQuicOverrideRequest.newBuilder().build();
     Operation response = targetHttpsProxyClient.setQuicOverrideTargetHttpsProxy(targetHttpsProxy, targetHttpsProxiesSetQuicOverrideRequestResource);
   }

  target-https-proxy - Name of the TargetHttpsProxy resource to set the QUIC override policy for. The name should conform to RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName`
  target-https-proxies-set-quic-override-request-resource - `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName target-https-proxy ^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest target-https-proxies-set-quic-override-request-resource]
    (-> this (.setQuicOverrideTargetHttpsProxy target-https-proxy target-https-proxies-set-quic-override-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetHttpsProxyClient this ^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest request]
    (-> this (.setQuicOverrideTargetHttpsProxy request))))

(defn delete-target-https-proxy-callable
  "Deletes the specified TargetHttpsProxy resource.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     String formattedTargetHttpsProxy = ProjectGlobalTargetHttpsProxyName.format(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     DeleteTargetHttpsProxyHttpRequest request = DeleteTargetHttpsProxyHttpRequest.newBuilder()
       .setTargetHttpsProxy(formattedTargetHttpsProxy)
       .build();
     ApiFuture<Operation> future = targetHttpsProxyClient.deleteTargetHttpsProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyClient this]
    (-> this (.deleteTargetHttpsProxyCallable))))

(defn set-ssl-certificates-target-https-proxy-callable
  "Replaces SslCertificates for TargetHttpsProxy.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     String formattedTargetHttpsProxy = ProjectTargetHttpsProxyName.format(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequestResource = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
     SetSslCertificatesTargetHttpsProxyHttpRequest request = SetSslCertificatesTargetHttpsProxyHttpRequest.newBuilder()
       .setTargetHttpsProxy(formattedTargetHttpsProxy)
       .setTargetHttpsProxiesSetSslCertificatesRequestResource(targetHttpsProxiesSetSslCertificatesRequestResource)
       .build();
     ApiFuture<Operation> future = targetHttpsProxyClient.setSslCertificatesTargetHttpsProxyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyClient this]
    (-> this (.setSslCertificatesTargetHttpsProxyCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TargetHttpsProxyClient this]
    (-> this (.isTerminated))))

(defn get-target-https-proxy-callable
  "Returns the specified TargetHttpsProxy resource. Gets a list of available target HTTPS proxies
   by making a list() request.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     String formattedTargetHttpsProxy = ProjectGlobalTargetHttpsProxyName.format(\"[PROJECT]\", \"[TARGET_HTTPS_PROXY]\");
     GetTargetHttpsProxyHttpRequest request = GetTargetHttpsProxyHttpRequest.newBuilder()
       .setTargetHttpsProxy(formattedTargetHttpsProxy)
       .build();
     ApiFuture<TargetHttpsProxy> future = targetHttpsProxyClient.getTargetHttpsProxyCallable().futureCall(request);
     // Do something
     TargetHttpsProxy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyClient this]
    (-> this (.getTargetHttpsProxyCallable))))

(defn shutdown-now
  ""
  ([^TargetHttpsProxyClient this]
    (-> this (.shutdownNow))))

(defn list-target-https-proxies-paged-callable
  "Retrieves the list of TargetHttpsProxy resources available to the specified project.

   Sample code:



   try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListTargetHttpsProxiesHttpRequest request = ListTargetHttpsProxiesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListTargetHttpsProxiesPagedResponse> future = targetHttpsProxyClient.listTargetHttpsProxiesPagedCallable().futureCall(request);
     // Do something
     for (TargetHttpsProxy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxyClient$ListTargetHttpsProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyClient this]
    (-> this (.listTargetHttpsProxiesPagedCallable))))


(ns com.google.cloud.compute.v1.SslCertificateClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
    ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of(\"[PROJECT]\", \"[SSL_CERTIFICATE]\");
    Operation response = sslCertificateClient.deleteSslCertificate(sslCertificate);
  }

  Note: close() needs to be called on the sslCertificateClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of SslCertificateSettings to
  create(). For example:

  To customize credentials:



  SslCertificateSettings sslCertificateSettings =
      SslCertificateSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SslCertificateClient sslCertificateClient =
      SslCertificateClient.create(sslCertificateSettings);

  To customize the endpoint:



  SslCertificateSettings sslCertificateSettings =
      SslCertificateSettings.newBuilder().setEndpoint(myEndpoint).build();
  SslCertificateClient sslCertificateClient =
      SslCertificateClient.create(sslCertificateSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslCertificateClient]))

(defn *create
  "Constructs an instance of SslCertificateClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.SslCertificateSettings`

  returns: `com.google.cloud.compute.v1.SslCertificateClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SslCertificateClient [^com.google.cloud.compute.v1.SslCertificateSettings settings]
    (SslCertificateClient/create settings))
  (^com.google.cloud.compute.v1.SslCertificateClient []
    (SslCertificateClient/create )))

(defn insert-ssl-certificate-callable
  "Creates a SslCertificate resource in the specified project using the data included in the
   request.

   Sample code:



   try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     SslCertificate sslCertificateResource = SslCertificate.newBuilder().build();
     InsertSslCertificateHttpRequest request = InsertSslCertificateHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setSslCertificateResource(sslCertificateResource)
       .build();
     ApiFuture<Operation> future = sslCertificateClient.insertSslCertificateCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateClient this]
    (-> this (.insertSslCertificateCallable))))

(defn get-ssl-certificate-callable
  "Returns the specified SslCertificate resource. Gets a list of available SSL certificates by
   making a list() request.

   Sample code:



   try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
     String formattedSslCertificate = ProjectGlobalSslCertificateName.format(\"[PROJECT]\", \"[SSL_CERTIFICATE]\");
     GetSslCertificateHttpRequest request = GetSslCertificateHttpRequest.newBuilder()
       .setSslCertificate(formattedSslCertificate)
       .build();
     ApiFuture<SslCertificate> future = sslCertificateClient.getSslCertificateCallable().futureCall(request);
     // Do something
     SslCertificate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSslCertificateHttpRequest,com.google.cloud.compute.v1.SslCertificate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateClient this]
    (-> this (.getSslCertificateCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.SslCertificateSettings`"
  (^com.google.cloud.compute.v1.SslCertificateSettings [^SslCertificateClient this]
    (-> this (.getSettings))))

(defn get-ssl-certificate
  "Returns the specified SslCertificate resource. Gets a list of available SSL certificates by
   making a list() request.

   Sample code:



   try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
     ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of(\"[PROJECT]\", \"[SSL_CERTIFICATE]\");
     SslCertificate response = sslCertificateClient.getSslCertificate(sslCertificate);
   }

  ssl-certificate - Name of the SslCertificate resource to return. - `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName`

  returns: `com.google.cloud.compute.v1.SslCertificate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SslCertificate [^SslCertificateClient this ^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName ssl-certificate]
    (-> this (.getSslCertificate ssl-certificate))))

(defn list-ssl-certificates-paged-callable
  "Retrieves the list of SslCertificate resources available to the specified project.

   Sample code:



   try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListSslCertificatesHttpRequest request = ListSslCertificatesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListSslCertificatesPagedResponse> future = sslCertificateClient.listSslCertificatesPagedCallable().futureCall(request);
     // Do something
     for (SslCertificate element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateClient$ListSslCertificatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateClient this]
    (-> this (.listSslCertificatesPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.SslCertificateStub`"
  ([^SslCertificateClient this]
    (-> this (.getStub))))

(defn list-ssl-certificates-callable
  "Retrieves the list of SslCertificate resources available to the specified project.

   Sample code:



   try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListSslCertificatesHttpRequest request = ListSslCertificatesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       SslCertificateList response = sslCertificateClient.listSslCertificatesCallable().call(request);
       for (SslCertificate element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateClient this]
    (-> this (.listSslCertificatesCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SslCertificateClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SslCertificateClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^SslCertificateClient this]
    (-> this (.shutdown))))

(defn list-ssl-certificates
  "Retrieves the list of SslCertificate resources available to the specified project.

   Sample code:



   try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (SslCertificate element : sslCertificateClient.listSslCertificates(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.SslCertificateClient$ListSslCertificatesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SslCertificateClient$ListSslCertificatesPagedResponse [^SslCertificateClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listSslCertificates project))))

(defn delete-ssl-certificate-callable
  "Deletes the specified SslCertificate resource.

   Sample code:



   try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
     String formattedSslCertificate = ProjectGlobalSslCertificateName.format(\"[PROJECT]\", \"[SSL_CERTIFICATE]\");
     DeleteSslCertificateHttpRequest request = DeleteSslCertificateHttpRequest.newBuilder()
       .setSslCertificate(formattedSslCertificate)
       .build();
     ApiFuture<Operation> future = sslCertificateClient.deleteSslCertificateCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateClient this]
    (-> this (.deleteSslCertificateCallable))))

(defn close
  ""
  ([^SslCertificateClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SslCertificateClient this]
    (-> this (.isTerminated))))

(defn insert-ssl-certificate
  "Creates a SslCertificate resource in the specified project using the data included in the
   request.

   Sample code:



   try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     SslCertificate sslCertificateResource = SslCertificate.newBuilder().build();
     Operation response = sslCertificateClient.insertSslCertificate(project, sslCertificateResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  ssl-certificate-resource - An SslCertificate resource. This resource provides a mechanism to upload an SSL key and certificate to the load balancer to serve secure connections from the user. (== resource_for beta.sslCertificates ==) (== resource_for v1.sslCertificates ==) - `com.google.cloud.compute.v1.SslCertificate`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SslCertificateClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.SslCertificate ssl-certificate-resource]
    (-> this (.insertSslCertificate project ssl-certificate-resource)))
  (^com.google.cloud.compute.v1.Operation [^SslCertificateClient this ^com.google.cloud.compute.v1.InsertSslCertificateHttpRequest request]
    (-> this (.insertSslCertificate request))))

(defn shutdown-now
  ""
  ([^SslCertificateClient this]
    (-> this (.shutdownNow))))

(defn delete-ssl-certificate
  "Deletes the specified SslCertificate resource.

   Sample code:



   try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
     ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of(\"[PROJECT]\", \"[SSL_CERTIFICATE]\");
     Operation response = sslCertificateClient.deleteSslCertificate(sslCertificate);
   }

  ssl-certificate - Name of the SslCertificate resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SslCertificateClient this ^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName ssl-certificate]
    (-> this (.deleteSslCertificate ssl-certificate))))


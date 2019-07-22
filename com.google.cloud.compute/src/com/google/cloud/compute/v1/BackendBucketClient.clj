(ns com.google.cloud.compute.v1.BackendBucketClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
    ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
    SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
    Operation response = backendBucketClient.addSignedUrlKeyBackendBucket(backendBucket, signedUrlKeyResource);
  }

  Note: close() needs to be called on the backendBucketClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of BackendBucketSettings to
  create(). For example:

  To customize credentials:



  BackendBucketSettings backendBucketSettings =
      BackendBucketSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  BackendBucketClient backendBucketClient =
      BackendBucketClient.create(backendBucketSettings);

  To customize the endpoint:



  BackendBucketSettings backendBucketSettings =
      BackendBucketSettings.newBuilder().setEndpoint(myEndpoint).build();
  BackendBucketClient backendBucketClient =
      BackendBucketClient.create(backendBucketSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendBucketClient]))

(defn *create
  "Constructs an instance of BackendBucketClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.BackendBucketSettings`

  returns: `com.google.cloud.compute.v1.BackendBucketClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.BackendBucketClient [^com.google.cloud.compute.v1.BackendBucketSettings settings]
    (BackendBucketClient/create settings))
  (^com.google.cloud.compute.v1.BackendBucketClient []
    (BackendBucketClient/create )))

(defn update-backend-bucket
  "Updates the specified BackendBucket resource with the data included in the request.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = backendBucketClient.updateBackendBucket(backendBucket, backendBucketResource, fieldMask);
   }

  backend-bucket - Name of the BackendBucket resource to update. - `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`
  backend-bucket-resource - A BackendBucket resource. This resource defines a Cloud Storage bucket. - `com.google.cloud.compute.v1.BackendBucket`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName backend-bucket ^com.google.cloud.compute.v1.BackendBucket backend-bucket-resource ^java.util.List field-mask]
    (-> this (.updateBackendBucket backend-bucket backend-bucket-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.UpdateBackendBucketHttpRequest request]
    (-> this (.updateBackendBucket request))))

(defn update-backend-bucket-callable
  "Updates the specified BackendBucket resource with the data included in the request.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     String formattedBackendBucket = ProjectGlobalBackendBucketName.format(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateBackendBucketHttpRequest request = UpdateBackendBucketHttpRequest.newBuilder()
       .setBackendBucket(formattedBackendBucket)
       .setBackendBucketResource(backendBucketResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = backendBucketClient.updateBackendBucketCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketClient this]
    (-> this (.updateBackendBucketCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.BackendBucketSettings`"
  (^com.google.cloud.compute.v1.BackendBucketSettings [^BackendBucketClient this]
    (-> this (.getSettings))))

(defn delete-backend-bucket
  "Deletes the specified BackendBucket resource.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     Operation response = backendBucketClient.deleteBackendBucket(backendBucket);
   }

  backend-bucket - Name of the BackendBucket resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName backend-bucket]
    (-> this (.deleteBackendBucket backend-bucket))))

(defn get-backend-bucket
  "Returns the specified BackendBucket resource. Gets a list of available backend buckets by
   making a list() request.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     BackendBucket response = backendBucketClient.getBackendBucket(backendBucket);
   }

  backend-bucket - Name of the BackendBucket resource to return. - `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`

  returns: `com.google.cloud.compute.v1.BackendBucket`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.BackendBucket [^BackendBucketClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName backend-bucket]
    (-> this (.getBackendBucket backend-bucket))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.BackendBucketStub`"
  ([^BackendBucketClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^BackendBucketClient this]
    (-> this (.isShutdown))))

(defn delete-backend-bucket-callable
  "Deletes the specified BackendBucket resource.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     String formattedBackendBucket = ProjectGlobalBackendBucketName.format(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     DeleteBackendBucketHttpRequest request = DeleteBackendBucketHttpRequest.newBuilder()
       .setBackendBucket(formattedBackendBucket)
       .build();
     ApiFuture<Operation> future = backendBucketClient.deleteBackendBucketCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketClient this]
    (-> this (.deleteBackendBucketCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^BackendBucketClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-signed-url-key-backend-bucket-callable
  "Deletes a key for validating requests with signed URLs for this backend bucket.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     String formattedBackendBucket = ProjectGlobalBackendBucketName.format(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     String keyName = \"\";
     DeleteSignedUrlKeyBackendBucketHttpRequest request = DeleteSignedUrlKeyBackendBucketHttpRequest.newBuilder()
       .setBackendBucket(formattedBackendBucket)
       .setKeyName(keyName)
       .build();
     ApiFuture<Operation> future = backendBucketClient.deleteSignedUrlKeyBackendBucketCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketClient this]
    (-> this (.deleteSignedUrlKeyBackendBucketCallable))))

(defn shutdown
  ""
  ([^BackendBucketClient this]
    (-> this (.shutdown))))

(defn get-backend-bucket-callable
  "Returns the specified BackendBucket resource. Gets a list of available backend buckets by
   making a list() request.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     String formattedBackendBucket = ProjectGlobalBackendBucketName.format(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     GetBackendBucketHttpRequest request = GetBackendBucketHttpRequest.newBuilder()
       .setBackendBucket(formattedBackendBucket)
       .build();
     ApiFuture<BackendBucket> future = backendBucketClient.getBackendBucketCallable().futureCall(request);
     // Do something
     BackendBucket response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetBackendBucketHttpRequest,com.google.cloud.compute.v1.BackendBucket>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketClient this]
    (-> this (.getBackendBucketCallable))))

(defn patch-backend-bucket-callable
  "Updates the specified BackendBucket resource with the data included in the request. This method
   supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     String formattedBackendBucket = ProjectGlobalBackendBucketName.format(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchBackendBucketHttpRequest request = PatchBackendBucketHttpRequest.newBuilder()
       .setBackendBucket(formattedBackendBucket)
       .setBackendBucketResource(backendBucketResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = backendBucketClient.patchBackendBucketCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketClient this]
    (-> this (.patchBackendBucketCallable))))

(defn delete-signed-url-key-backend-bucket
  "Deletes a key for validating requests with signed URLs for this backend bucket.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     String keyName = \"\";
     Operation response = backendBucketClient.deleteSignedUrlKeyBackendBucket(backendBucket, keyName);
   }

  backend-bucket - Name of the BackendBucket resource to which the Signed URL Key should be added. The name should conform to RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`
  key-name - The name of the Signed URL Key to delete. - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName backend-bucket ^java.lang.String key-name]
    (-> this (.deleteSignedUrlKeyBackendBucket backend-bucket key-name)))
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendBucketHttpRequest request]
    (-> this (.deleteSignedUrlKeyBackendBucket request))))

(defn close
  ""
  ([^BackendBucketClient this]
    (-> this (.close))))

(defn list-backend-buckets-callable
  "Retrieves the list of BackendBucket resources available to the specified project.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListBackendBucketsHttpRequest request = ListBackendBucketsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       BackendBucketList response = backendBucketClient.listBackendBucketsCallable().call(request);
       for (BackendBucket element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendBucketsHttpRequest,com.google.cloud.compute.v1.BackendBucketList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketClient this]
    (-> this (.listBackendBucketsCallable))))

(defn add-signed-url-key-backend-bucket
  "Adds a key for validating requests with signed URLs for this backend bucket.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
     Operation response = backendBucketClient.addSignedUrlKeyBackendBucket(backendBucket, signedUrlKeyResource);
   }

  backend-bucket - Name of the BackendBucket resource to which the Signed URL Key should be added. The name should conform to RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`
  signed-url-key-resource - Represents a customer-supplied Signing Key used by Cloud CDN Signed URLs - `com.google.cloud.compute.v1.SignedUrlKey`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName backend-bucket ^com.google.cloud.compute.v1.SignedUrlKey signed-url-key-resource]
    (-> this (.addSignedUrlKeyBackendBucket backend-bucket signed-url-key-resource)))
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest request]
    (-> this (.addSignedUrlKeyBackendBucket request))))

(defn list-backend-buckets-paged-callable
  "Retrieves the list of BackendBucket resources available to the specified project.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListBackendBucketsHttpRequest request = ListBackendBucketsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListBackendBucketsPagedResponse> future = backendBucketClient.listBackendBucketsPagedCallable().futureCall(request);
     // Do something
     for (BackendBucket element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendBucketsHttpRequest,com.google.cloud.compute.v1.BackendBucketClient$ListBackendBucketsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketClient this]
    (-> this (.listBackendBucketsPagedCallable))))

(defn insert-backend-bucket-callable
  "Creates a BackendBucket resource in the specified project using the data included in the
   request.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
     InsertBackendBucketHttpRequest request = InsertBackendBucketHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setBackendBucketResource(backendBucketResource)
       .build();
     ApiFuture<Operation> future = backendBucketClient.insertBackendBucketCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketClient this]
    (-> this (.insertBackendBucketCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^BackendBucketClient this]
    (-> this (.isTerminated))))

(defn patch-backend-bucket
  "Updates the specified BackendBucket resource with the data included in the request. This method
   supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = backendBucketClient.patchBackendBucket(backendBucket, backendBucketResource, fieldMask);
   }

  backend-bucket - Name of the BackendBucket resource to patch. - `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`
  backend-bucket-resource - A BackendBucket resource. This resource defines a Cloud Storage bucket. - `com.google.cloud.compute.v1.BackendBucket`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName backend-bucket ^com.google.cloud.compute.v1.BackendBucket backend-bucket-resource ^java.util.List field-mask]
    (-> this (.patchBackendBucket backend-bucket backend-bucket-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.PatchBackendBucketHttpRequest request]
    (-> this (.patchBackendBucket request))))

(defn insert-backend-bucket
  "Creates a BackendBucket resource in the specified project using the data included in the
   request.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
     Operation response = backendBucketClient.insertBackendBucket(project, backendBucketResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  backend-bucket-resource - A BackendBucket resource. This resource defines a Cloud Storage bucket. - `com.google.cloud.compute.v1.BackendBucket`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.BackendBucket backend-bucket-resource]
    (-> this (.insertBackendBucket project backend-bucket-resource)))
  (^com.google.cloud.compute.v1.Operation [^BackendBucketClient this ^com.google.cloud.compute.v1.InsertBackendBucketHttpRequest request]
    (-> this (.insertBackendBucket request))))

(defn list-backend-buckets
  "Retrieves the list of BackendBucket resources available to the specified project.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (BackendBucket element : backendBucketClient.listBackendBuckets(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.BackendBucketClient$ListBackendBucketsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.BackendBucketClient$ListBackendBucketsPagedResponse [^BackendBucketClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listBackendBuckets project))))

(defn shutdown-now
  ""
  ([^BackendBucketClient this]
    (-> this (.shutdownNow))))

(defn add-signed-url-key-backend-bucket-callable
  "Adds a key for validating requests with signed URLs for this backend bucket.

   Sample code:



   try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
     String formattedBackendBucket = ProjectGlobalBackendBucketName.format(\"[PROJECT]\", \"[BACKEND_BUCKET]\");
     SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
     AddSignedUrlKeyBackendBucketHttpRequest request = AddSignedUrlKeyBackendBucketHttpRequest.newBuilder()
       .setBackendBucket(formattedBackendBucket)
       .setSignedUrlKeyResource(signedUrlKeyResource)
       .build();
     ApiFuture<Operation> future = backendBucketClient.addSignedUrlKeyBackendBucketCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketClient this]
    (-> this (.addSignedUrlKeyBackendBucketCallable))))


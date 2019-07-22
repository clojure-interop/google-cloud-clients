(ns com.google.cloud.compute.v1.LicenseCodeClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (LicenseCodeClient licenseCodeClient = LicenseCodeClient.create()) {
    ProjectGlobalLicenseCodeName licenseCode = ProjectGlobalLicenseCodeName.of(\"[PROJECT]\", \"[LICENSE_CODE]\");
    LicenseCode response = licenseCodeClient.getLicenseCode(licenseCode);
  }

  Note: close() needs to be called on the licenseCodeClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of LicenseCodeSettings to
  create(). For example:

  To customize credentials:



  LicenseCodeSettings licenseCodeSettings =
      LicenseCodeSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  LicenseCodeClient licenseCodeClient =
      LicenseCodeClient.create(licenseCodeSettings);

  To customize the endpoint:



  LicenseCodeSettings licenseCodeSettings =
      LicenseCodeSettings.newBuilder().setEndpoint(myEndpoint).build();
  LicenseCodeClient licenseCodeClient =
      LicenseCodeClient.create(licenseCodeSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseCodeClient]))

(defn *create
  "Constructs an instance of LicenseCodeClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.LicenseCodeSettings`

  returns: `com.google.cloud.compute.v1.LicenseCodeClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.LicenseCodeClient [^com.google.cloud.compute.v1.LicenseCodeSettings settings]
    (LicenseCodeClient/create settings))
  (^com.google.cloud.compute.v1.LicenseCodeClient []
    (LicenseCodeClient/create )))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.LicenseCodeSettings`"
  (^com.google.cloud.compute.v1.LicenseCodeSettings [^LicenseCodeClient this]
    (-> this (.getSettings))))

(defn get-license-code
  "Return a specified license code. License codes are mirrored across all projects that have
   permissions to read the License Code.

   Sample code:



   try (LicenseCodeClient licenseCodeClient = LicenseCodeClient.create()) {
     ProjectGlobalLicenseCodeName licenseCode = ProjectGlobalLicenseCodeName.of(\"[PROJECT]\", \"[LICENSE_CODE]\");
     LicenseCode response = licenseCodeClient.getLicenseCode(licenseCode);
   }

  license-code - Number corresponding to the License code resource to return. - `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName`

  returns: `com.google.cloud.compute.v1.LicenseCode`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.LicenseCode [^LicenseCodeClient this ^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName license-code]
    (-> this (.getLicenseCode license-code))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.LicenseCodeStub`"
  ([^LicenseCodeClient this]
    (-> this (.getStub))))

(defn test-iam-permissions-license-code-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (LicenseCodeClient licenseCodeClient = LicenseCodeClient.create()) {
     String formattedResource = ProjectGlobalLicenseCodeResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsLicenseCodeHttpRequest request = TestIamPermissionsLicenseCodeHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = licenseCodeClient.testIamPermissionsLicenseCodeCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsLicenseCodeHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseCodeClient this]
    (-> this (.testIamPermissionsLicenseCodeCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^LicenseCodeClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^LicenseCodeClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^LicenseCodeClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^LicenseCodeClient this]
    (-> this (.close))))

(defn test-iam-permissions-license-code
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (LicenseCodeClient licenseCodeClient = LicenseCodeClient.create()) {
     ProjectGlobalLicenseCodeResourceName resource = ProjectGlobalLicenseCodeResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = licenseCodeClient.testIamPermissionsLicenseCode(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^LicenseCodeClient this ^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsLicenseCode resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^LicenseCodeClient this ^com.google.cloud.compute.v1.TestIamPermissionsLicenseCodeHttpRequest request]
    (-> this (.testIamPermissionsLicenseCode request))))

(defn get-license-code-callable
  "Return a specified license code. License codes are mirrored across all projects that have
   permissions to read the License Code.

   Sample code:



   try (LicenseCodeClient licenseCodeClient = LicenseCodeClient.create()) {
     String formattedLicenseCode = ProjectGlobalLicenseCodeName.format(\"[PROJECT]\", \"[LICENSE_CODE]\");
     GetLicenseCodeHttpRequest request = GetLicenseCodeHttpRequest.newBuilder()
       .setLicenseCode(formattedLicenseCode)
       .build();
     ApiFuture<LicenseCode> future = licenseCodeClient.getLicenseCodeCallable().futureCall(request);
     // Do something
     LicenseCode response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetLicenseCodeHttpRequest,com.google.cloud.compute.v1.LicenseCode>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseCodeClient this]
    (-> this (.getLicenseCodeCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^LicenseCodeClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^LicenseCodeClient this]
    (-> this (.shutdownNow))))


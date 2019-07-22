(ns com.google.cloud.compute.v1.LicenseClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (LicenseClient licenseClient = LicenseClient.create()) {
    ProjectGlobalLicenseName license = ProjectGlobalLicenseName.of(\"[PROJECT]\", \"[LICENSE]\");
    Operation response = licenseClient.deleteLicense(license);
  }

  Note: close() needs to be called on the licenseClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of LicenseSettings to create().
  For example:

  To customize credentials:



  LicenseSettings licenseSettings =
      LicenseSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  LicenseClient licenseClient =
      LicenseClient.create(licenseSettings);

  To customize the endpoint:



  LicenseSettings licenseSettings =
      LicenseSettings.newBuilder().setEndpoint(myEndpoint).build();
  LicenseClient licenseClient =
      LicenseClient.create(licenseSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseClient]))

(defn *create
  "Constructs an instance of LicenseClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.LicenseSettings`

  returns: `com.google.cloud.compute.v1.LicenseClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.LicenseClient [^com.google.cloud.compute.v1.LicenseSettings settings]
    (LicenseClient/create settings))
  (^com.google.cloud.compute.v1.LicenseClient []
    (LicenseClient/create )))

(defn insert-license-callable
  "Create a License resource in the specified project.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     License licenseResource = License.newBuilder().build();
     InsertLicenseHttpRequest request = InsertLicenseHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setLicenseResource(licenseResource)
       .build();
     ApiFuture<Operation> future = licenseClient.insertLicenseCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseClient this]
    (-> this (.insertLicenseCallable))))

(defn set-iam-policy-license-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     String formattedResource = ProjectGlobalLicenseResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
     SetIamPolicyLicenseHttpRequest request = SetIamPolicyLicenseHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setGlobalSetPolicyRequestResource(globalSetPolicyRequestResource)
       .build();
     ApiFuture<Policy> future = licenseClient.setIamPolicyLicenseCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseClient this]
    (-> this (.setIamPolicyLicenseCallable))))

(defn list-licenses
  "Retrieves the list of licenses available in the specified project. This method does not get any
   licenses that belong to other projects, including licenses attached to publicly-available
   images, like Debian 9. If you want to get a list of publicly-available licenses, use this
   method to make a request to the respective image project, such as debian-cloud or
   windows-cloud.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (License element : licenseClient.listLicenses(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.LicenseClient$ListLicensesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.LicenseClient$ListLicensesPagedResponse [^LicenseClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listLicenses project))))

(defn insert-license
  "Create a License resource in the specified project.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     License licenseResource = License.newBuilder().build();
     Operation response = licenseClient.insertLicense(project, licenseResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  license-resource - A license resource. - `com.google.cloud.compute.v1.License`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^LicenseClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.License license-resource]
    (-> this (.insertLicense project license-resource)))
  (^com.google.cloud.compute.v1.Operation [^LicenseClient this ^com.google.cloud.compute.v1.InsertLicenseHttpRequest request]
    (-> this (.insertLicense request))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.LicenseSettings`"
  (^com.google.cloud.compute.v1.LicenseSettings [^LicenseClient this]
    (-> this (.getSettings))))

(defn get-license
  "Returns the specified License resource.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     ProjectGlobalLicenseName license = ProjectGlobalLicenseName.of(\"[PROJECT]\", \"[LICENSE]\");
     License response = licenseClient.getLicense(license);
   }

  license - Name of the License resource to return. - `com.google.cloud.compute.v1.ProjectGlobalLicenseName`

  returns: `com.google.cloud.compute.v1.License`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.License [^LicenseClient this ^com.google.cloud.compute.v1.ProjectGlobalLicenseName license]
    (-> this (.getLicense license))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.LicenseStub`"
  ([^LicenseClient this]
    (-> this (.getStub))))

(defn get-license-callable
  "Returns the specified License resource.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     String formattedLicense = ProjectGlobalLicenseName.format(\"[PROJECT]\", \"[LICENSE]\");
     GetLicenseHttpRequest request = GetLicenseHttpRequest.newBuilder()
       .setLicense(formattedLicense)
       .build();
     ApiFuture<License> future = licenseClient.getLicenseCallable().futureCall(request);
     // Do something
     License response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetLicenseHttpRequest,com.google.cloud.compute.v1.License>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseClient this]
    (-> this (.getLicenseCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^LicenseClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^LicenseClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn get-iam-policy-license
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     ProjectGlobalLicenseResourceName resource = ProjectGlobalLicenseResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     Policy response = licenseClient.getIamPolicyLicense(resource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^LicenseClient this ^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName resource]
    (-> this (.getIamPolicyLicense resource))))

(defn shutdown
  ""
  ([^LicenseClient this]
    (-> this (.shutdown))))

(defn get-iam-policy-license-callable
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     String formattedResource = ProjectGlobalLicenseResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GetIamPolicyLicenseHttpRequest request = GetIamPolicyLicenseHttpRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = licenseClient.getIamPolicyLicenseCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseClient this]
    (-> this (.getIamPolicyLicenseCallable))))

(defn delete-license-callable
  "Deletes the specified license.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     String formattedLicense = ProjectGlobalLicenseName.format(\"[PROJECT]\", \"[LICENSE]\");
     DeleteLicenseHttpRequest request = DeleteLicenseHttpRequest.newBuilder()
       .setLicense(formattedLicense)
       .build();
     ApiFuture<Operation> future = licenseClient.deleteLicenseCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseClient this]
    (-> this (.deleteLicenseCallable))))

(defn set-iam-policy-license
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     ProjectGlobalLicenseResourceName resource = ProjectGlobalLicenseResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
     Policy response = licenseClient.setIamPolicyLicense(resource, globalSetPolicyRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName`
  global-set-policy-request-resource - `com.google.cloud.compute.v1.GlobalSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^LicenseClient this ^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName resource ^com.google.cloud.compute.v1.GlobalSetPolicyRequest global-set-policy-request-resource]
    (-> this (.setIamPolicyLicense resource global-set-policy-request-resource)))
  (^com.google.cloud.compute.v1.Policy [^LicenseClient this ^com.google.cloud.compute.v1.SetIamPolicyLicenseHttpRequest request]
    (-> this (.setIamPolicyLicense request))))

(defn close
  ""
  ([^LicenseClient this]
    (-> this (.close))))

(defn delete-license
  "Deletes the specified license.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     ProjectGlobalLicenseName license = ProjectGlobalLicenseName.of(\"[PROJECT]\", \"[LICENSE]\");
     Operation response = licenseClient.deleteLicense(license);
   }

  license - Name of the license resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalLicenseName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^LicenseClient this ^com.google.cloud.compute.v1.ProjectGlobalLicenseName license]
    (-> this (.deleteLicense license))))

(defn test-iam-permissions-license
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     ProjectGlobalLicenseResourceName resource = ProjectGlobalLicenseResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = licenseClient.testIamPermissionsLicense(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^LicenseClient this ^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsLicense resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^LicenseClient this ^com.google.cloud.compute.v1.TestIamPermissionsLicenseHttpRequest request]
    (-> this (.testIamPermissionsLicense request))))

(defn test-iam-permissions-license-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     String formattedResource = ProjectGlobalLicenseResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsLicenseHttpRequest request = TestIamPermissionsLicenseHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = licenseClient.testIamPermissionsLicenseCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsLicenseHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseClient this]
    (-> this (.testIamPermissionsLicenseCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^LicenseClient this]
    (-> this (.isTerminated))))

(defn list-licenses-paged-callable
  "Retrieves the list of licenses available in the specified project. This method does not get any
   licenses that belong to other projects, including licenses attached to publicly-available
   images, like Debian 9. If you want to get a list of publicly-available licenses, use this
   method to make a request to the respective image project, such as debian-cloud or
   windows-cloud.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListLicensesHttpRequest request = ListLicensesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListLicensesPagedResponse> future = licenseClient.listLicensesPagedCallable().futureCall(request);
     // Do something
     for (License element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicenseClient$ListLicensesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseClient this]
    (-> this (.listLicensesPagedCallable))))

(defn list-licenses-callable
  "Retrieves the list of licenses available in the specified project. This method does not get any
   licenses that belong to other projects, including licenses attached to publicly-available
   images, like Debian 9. If you want to get a list of publicly-available licenses, use this
   method to make a request to the respective image project, such as debian-cloud or
   windows-cloud.

   Sample code:



   try (LicenseClient licenseClient = LicenseClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListLicensesHttpRequest request = ListLicensesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       LicensesListResponse response = licenseClient.listLicensesCallable().call(request);
       for (License element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicensesListResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseClient this]
    (-> this (.listLicensesCallable))))

(defn shutdown-now
  ""
  ([^LicenseClient this]
    (-> this (.shutdownNow))))


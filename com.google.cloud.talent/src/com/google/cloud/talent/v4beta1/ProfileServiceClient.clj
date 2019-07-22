(ns com.google.cloud.talent.v4beta1.ProfileServiceClient
  "Service Description: A service that handles profile management, including profile CRUD,
  enumeration and search.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
    TenantName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
    Profile profile = Profile.newBuilder().build();
    Profile response = profileServiceClient.createProfile(parent, profile);
  }

  Note: close() needs to be called on the profileServiceClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of ProfileServiceSettings to
  create(). For example:

  To customize credentials:



  ProfileServiceSettings profileServiceSettings =
      ProfileServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ProfileServiceClient profileServiceClient =
      ProfileServiceClient.create(profileServiceSettings);

  To customize the endpoint:



  ProfileServiceSettings profileServiceSettings =
      ProfileServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  ProfileServiceClient profileServiceClient =
      ProfileServiceClient.create(profileServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 ProfileServiceClient]))

(defn *create
  "Constructs an instance of ProfileServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.talent.v4beta1.ProfileServiceSettings`

  returns: `com.google.cloud.talent.v4beta1.ProfileServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.ProfileServiceClient [^com.google.cloud.talent.v4beta1.ProfileServiceSettings settings]
    (ProfileServiceClient/create settings))
  (^com.google.cloud.talent.v4beta1.ProfileServiceClient []
    (ProfileServiceClient/create )))

(defn search-profiles-paged-callable
  "Searches for profiles within a tenant.

   For example, search by raw queries \"software engineer in Mountain View\" or search by
   structured filters (location filter, education filter, etc.).

   See [SearchProfilesRequest][google.cloud.talent.v4beta1.SearchProfilesRequest] for more
   information.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     TenantName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     RequestMetadata requestMetadata = RequestMetadata.newBuilder().build();
     SearchProfilesRequest request = SearchProfilesRequest.newBuilder()
       .setParent(parent.toString())
       .setRequestMetadata(requestMetadata)
       .build();
     ApiFuture<SearchProfilesPagedResponse> future = profileServiceClient.searchProfilesPagedCallable().futureCall(request);
     // Do something
     for (SummarizedProfile element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchProfilesRequest,com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceClient this]
    (-> this (.searchProfilesPagedCallable))))

(defn search-profiles
  "Searches for profiles within a tenant.

   For example, search by raw queries \"software engineer in Mountain View\" or search by
   structured filters (location filter, education filter, etc.).

   See [SearchProfilesRequest][google.cloud.talent.v4beta1.SearchProfilesRequest] for more
   information.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     TenantName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     RequestMetadata requestMetadata = RequestMetadata.newBuilder().build();
     SearchProfilesRequest request = SearchProfilesRequest.newBuilder()
       .setParent(parent.toString())
       .setRequestMetadata(requestMetadata)
       .build();
     for (SummarizedProfile element : profileServiceClient.searchProfiles(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.talent.v4beta1.SearchProfilesRequest`

  returns: `com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse [^ProfileServiceClient this ^com.google.cloud.talent.v4beta1.SearchProfilesRequest request]
    (-> this (.searchProfiles request))))

(defn list-profiles-paged-callable
  "Lists profiles by filter. The order is unspecified.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     TenantName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     ListProfilesRequest request = ListProfilesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListProfilesPagedResponse> future = profileServiceClient.listProfilesPagedCallable().futureCall(request);
     // Do something
     for (Profile element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListProfilesRequest,com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceClient this]
    (-> this (.listProfilesPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.talent.v4beta1.ProfileServiceSettings`"
  (^com.google.cloud.talent.v4beta1.ProfileServiceSettings [^ProfileServiceClient this]
    (-> this (.getSettings))))

(defn update-profile-callable
  "Updates the specified profile and returns the updated result.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     Profile profile = Profile.newBuilder().build();
     UpdateProfileRequest request = UpdateProfileRequest.newBuilder()
       .setProfile(profile)
       .build();
     ApiFuture<Profile> future = profileServiceClient.updateProfileCallable().futureCall(request);
     // Do something
     Profile response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceClient this]
    (-> this (.updateProfileCallable))))

(defn delete-profile
  "Deletes the specified profile. Prerequisite: The profile has no associated applications or
   assignments associated.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     ProfileName name = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
     profileServiceClient.deleteProfile(name);
   }

  name - Required. Resource name of the profile to be deleted. The format is \"projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}\", for example, \"projects/api-test-project/tenants/foo/profiles/bar\". - `com.google.cloud.talent.v4beta1.ProfileName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ProfileServiceClient this ^com.google.cloud.talent.v4beta1.ProfileName name]
    (-> this (.deleteProfile name))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.ProfileServiceStub`"
  ([^ProfileServiceClient this]
    (-> this (.getStub))))

(defn create-profile
  "Creates and returns a new profile.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     TenantName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     Profile profile = Profile.newBuilder().build();
     Profile response = profileServiceClient.createProfile(parent, profile);
   }

  parent - Required. The name of the tenant this profile belongs to. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenants/foo\". - `com.google.cloud.talent.v4beta1.TenantName`
  profile - Required. The profile to be created. - `com.google.cloud.talent.v4beta1.Profile`

  returns: `com.google.cloud.talent.v4beta1.Profile`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Profile [^ProfileServiceClient this ^com.google.cloud.talent.v4beta1.TenantName parent ^com.google.cloud.talent.v4beta1.Profile profile]
    (-> this (.createProfile parent profile)))
  (^com.google.cloud.talent.v4beta1.Profile [^ProfileServiceClient this ^com.google.cloud.talent.v4beta1.CreateProfileRequest request]
    (-> this (.createProfile request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ProfileServiceClient this]
    (-> this (.isShutdown))))

(defn delete-profile-callable
  "Deletes the specified profile. Prerequisite: The profile has no associated applications or
   assignments associated.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     ProfileName name = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
     DeleteProfileRequest request = DeleteProfileRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = profileServiceClient.deleteProfileCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteProfileRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceClient this]
    (-> this (.deleteProfileCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ProfileServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ProfileServiceClient this]
    (-> this (.shutdown))))

(defn get-profile-callable
  "Gets the specified profile.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     ProfileName name = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
     GetProfileRequest request = GetProfileRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Profile> future = profileServiceClient.getProfileCallable().futureCall(request);
     // Do something
     Profile response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceClient this]
    (-> this (.getProfileCallable))))

(defn update-profile
  "Updates the specified profile and returns the updated result.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     Profile profile = Profile.newBuilder().build();
     Profile response = profileServiceClient.updateProfile(profile);
   }

  profile - Required. Profile to be updated. - `com.google.cloud.talent.v4beta1.Profile`

  returns: `com.google.cloud.talent.v4beta1.Profile`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Profile [^ProfileServiceClient this ^com.google.cloud.talent.v4beta1.Profile profile]
    (-> this (.updateProfile profile))))

(defn search-profiles-callable
  "Searches for profiles within a tenant.

   For example, search by raw queries \"software engineer in Mountain View\" or search by
   structured filters (location filter, education filter, etc.).

   See [SearchProfilesRequest][google.cloud.talent.v4beta1.SearchProfilesRequest] for more
   information.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     TenantName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     RequestMetadata requestMetadata = RequestMetadata.newBuilder().build();
     SearchProfilesRequest request = SearchProfilesRequest.newBuilder()
       .setParent(parent.toString())
       .setRequestMetadata(requestMetadata)
       .build();
     while (true) {
       SearchProfilesResponse response = profileServiceClient.searchProfilesCallable().call(request);
       for (SummarizedProfile element : response.getSummarizedProfilesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchProfilesRequest,com.google.cloud.talent.v4beta1.SearchProfilesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceClient this]
    (-> this (.searchProfilesCallable))))

(defn list-profiles-callable
  "Lists profiles by filter. The order is unspecified.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     TenantName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     ListProfilesRequest request = ListProfilesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListProfilesResponse response = profileServiceClient.listProfilesCallable().call(request);
       for (Profile element : response.getProfilesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListProfilesRequest,com.google.cloud.talent.v4beta1.ListProfilesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceClient this]
    (-> this (.listProfilesCallable))))

(defn close
  ""
  ([^ProfileServiceClient this]
    (-> this (.close))))

(defn list-profiles
  "Lists profiles by filter. The order is unspecified.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     TenantName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     for (Profile element : profileServiceClient.listProfiles(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The resource name of the tenant under which the profile is created. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenants/foo\". - `com.google.cloud.talent.v4beta1.TenantName`

  returns: `com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPagedResponse [^ProfileServiceClient this ^com.google.cloud.talent.v4beta1.TenantName parent]
    (-> this (.listProfiles parent))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ProfileServiceClient this]
    (-> this (.isTerminated))))

(defn get-profile
  "Gets the specified profile.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     ProfileName name = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
     Profile response = profileServiceClient.getProfile(name);
   }

  name - Required. Resource name of the profile to get. The format is \"projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}\", for example, \"projects/api-test-project/tenants/foo/profiles/bar\". - `com.google.cloud.talent.v4beta1.ProfileName`

  returns: `com.google.cloud.talent.v4beta1.Profile`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Profile [^ProfileServiceClient this ^com.google.cloud.talent.v4beta1.ProfileName name]
    (-> this (.getProfile name))))

(defn shutdown-now
  ""
  ([^ProfileServiceClient this]
    (-> this (.shutdownNow))))

(defn create-profile-callable
  "Creates and returns a new profile.

   Sample code:



   try (ProfileServiceClient profileServiceClient = ProfileServiceClient.create()) {
     TenantName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     Profile profile = Profile.newBuilder().build();
     CreateProfileRequest request = CreateProfileRequest.newBuilder()
       .setParent(parent.toString())
       .setProfile(profile)
       .build();
     ApiFuture<Profile> future = profileServiceClient.createProfileCallable().futureCall(request);
     // Do something
     Profile response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceClient this]
    (-> this (.createProfileCallable))))


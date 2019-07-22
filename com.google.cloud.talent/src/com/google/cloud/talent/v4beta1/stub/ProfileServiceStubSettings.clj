(ns com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings
  "Settings class to configure an instance of ProfileServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createProfile to 30 seconds:



  ProfileServiceStubSettings.Builder profileServiceSettingsBuilder =
      ProfileServiceStubSettings.newBuilder();
  profileServiceSettingsBuilder.createProfileSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ProfileServiceStubSettings profileServiceSettings = profileServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub ProfileServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ProfileServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ProfileServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ProfileServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ProfileServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ProfileServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ProfileServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ProfileServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ProfileServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder []
    (ProfileServiceStubSettings/newBuilder )))

(defn list-profiles-settings
  "Returns the object with the settings used for calls to listProfiles.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.ListProfilesRequest,com.google.cloud.talent.v4beta1.ListProfilesResponse,com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ProfileServiceStubSettings this]
    (-> this (.listProfilesSettings))))

(defn create-profile-settings
  "Returns the object with the settings used for calls to createProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CreateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProfileServiceStubSettings this]
    (-> this (.createProfileSettings))))

(defn get-profile-settings
  "Returns the object with the settings used for calls to getProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.GetProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProfileServiceStubSettings this]
    (-> this (.getProfileSettings))))

(defn update-profile-settings
  "Returns the object with the settings used for calls to updateProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.UpdateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProfileServiceStubSettings this]
    (-> this (.updateProfileSettings))))

(defn delete-profile-settings
  "Returns the object with the settings used for calls to deleteProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.DeleteProfileRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProfileServiceStubSettings this]
    (-> this (.deleteProfileSettings))))

(defn search-profiles-settings
  "Returns the object with the settings used for calls to searchProfiles.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.SearchProfilesRequest,com.google.cloud.talent.v4beta1.SearchProfilesResponse,com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ProfileServiceStubSettings this]
    (-> this (.searchProfilesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.ProfileServiceStub`

  throws: java.io.IOException"
  ([^ProfileServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder [^ProfileServiceStubSettings this]
    (-> this (.toBuilder))))


(ns com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings
  "Settings class to configure an instance of ApplicationServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createApplication to 30 seconds:



  ApplicationServiceStubSettings.Builder applicationServiceSettingsBuilder =
      ApplicationServiceStubSettings.newBuilder();
  applicationServiceSettingsBuilder.createApplicationSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ApplicationServiceStubSettings applicationServiceSettings = applicationServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub ApplicationServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ApplicationServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ApplicationServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ApplicationServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ApplicationServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ApplicationServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ApplicationServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ApplicationServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ApplicationServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings$Builder []
    (ApplicationServiceStubSettings/newBuilder )))

(defn create-application-settings
  "Returns the object with the settings used for calls to createApplication.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CreateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ApplicationServiceStubSettings this]
    (-> this (.createApplicationSettings))))

(defn get-application-settings
  "Returns the object with the settings used for calls to getApplication.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.GetApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ApplicationServiceStubSettings this]
    (-> this (.getApplicationSettings))))

(defn update-application-settings
  "Returns the object with the settings used for calls to updateApplication.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.UpdateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ApplicationServiceStubSettings this]
    (-> this (.updateApplicationSettings))))

(defn delete-application-settings
  "Returns the object with the settings used for calls to deleteApplication.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.DeleteApplicationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ApplicationServiceStubSettings this]
    (-> this (.deleteApplicationSettings))))

(defn list-applications-settings
  "Returns the object with the settings used for calls to listApplications.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.ListApplicationsRequest,com.google.cloud.talent.v4beta1.ListApplicationsResponse,com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ApplicationServiceStubSettings this]
    (-> this (.listApplicationsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.ApplicationServiceStub`

  throws: java.io.IOException"
  ([^ApplicationServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings$Builder [^ApplicationServiceStubSettings this]
    (-> this (.toBuilder))))


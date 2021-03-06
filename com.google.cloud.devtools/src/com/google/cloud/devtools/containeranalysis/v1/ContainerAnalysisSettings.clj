(ns com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings
  "Settings class to configure an instance of ContainerAnalysisClient.

  The default instance has everything set to sensible defaults:


    The default service address (containeranalysis.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of setIamPolicy to 30 seconds:



  ContainerAnalysisSettings.Builder containerAnalysisSettingsBuilder =
      ContainerAnalysisSettings.newBuilder();
  containerAnalysisSettingsBuilder.setIamPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ContainerAnalysisSettings containerAnalysisSettings = containerAnalysisSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1 ContainerAnalysisSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ContainerAnalysisSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ContainerAnalysisSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ContainerAnalysisSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ContainerAnalysisSettings/newBuilder client-context))
  (^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings$Builder []
    (ContainerAnalysisSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ContainerAnalysisSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings`

  returns: `com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings [^com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings stub]
    (ContainerAnalysisSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ContainerAnalysisSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ContainerAnalysisSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ContainerAnalysisSettings/getDefaultServiceScopes )))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisSettings this]
    (-> this (.setIamPolicySettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisSettings this]
    (-> this (.getIamPolicySettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings$Builder [^ContainerAnalysisSettings this]
    (-> this (.toBuilder))))


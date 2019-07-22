(ns com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings
  "Settings class to configure an instance of ContainerAnalysisStub.

  The default instance has everything set to sensible defaults:


    The default service address (containeranalysis.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of setIamPolicy to 30 seconds:



  ContainerAnalysisStubSettings.Builder containerAnalysisSettingsBuilder =
      ContainerAnalysisStubSettings.newBuilder();
  containerAnalysisSettingsBuilder.setIamPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ContainerAnalysisStubSettings containerAnalysisSettings = containerAnalysisSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1.stub ContainerAnalysisStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ContainerAnalysisStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ContainerAnalysisStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ContainerAnalysisStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ContainerAnalysisStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ContainerAnalysisStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ContainerAnalysisStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ContainerAnalysisStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ContainerAnalysisStubSettings/newBuilder client-context))
  (^com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings$Builder []
    (ContainerAnalysisStubSettings/newBuilder )))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisStubSettings this]
    (-> this (.setIamPolicySettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisStubSettings this]
    (-> this (.getIamPolicySettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisStubSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStub`

  throws: java.io.IOException"
  ([^ContainerAnalysisStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings$Builder [^ContainerAnalysisStubSettings this]
    (-> this (.toBuilder))))


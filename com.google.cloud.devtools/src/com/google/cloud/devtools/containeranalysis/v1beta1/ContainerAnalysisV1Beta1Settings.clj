(ns com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings
  "Settings class to configure an instance of ContainerAnalysisV1Beta1Client.

  The default instance has everything set to sensible defaults:


    The default service address (containeranalysis.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of setIamPolicy to 30 seconds:



  ContainerAnalysisV1Beta1Settings.Builder containerAnalysisV1Beta1SettingsBuilder =
      ContainerAnalysisV1Beta1Settings.newBuilder();
  containerAnalysisV1Beta1SettingsBuilder.setIamPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ContainerAnalysisV1Beta1Settings containerAnalysisV1Beta1Settings = containerAnalysisV1Beta1SettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1 ContainerAnalysisV1Beta1Settings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ContainerAnalysisV1Beta1Settings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ContainerAnalysisV1Beta1Settings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ContainerAnalysisV1Beta1Settings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ContainerAnalysisV1Beta1Settings/newBuilder client-context))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings$Builder []
    (ContainerAnalysisV1Beta1Settings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ContainerAnalysisV1Beta1Settings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1StubSettings`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings [^com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1StubSettings stub]
    (ContainerAnalysisV1Beta1Settings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ContainerAnalysisV1Beta1Settings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ContainerAnalysisV1Beta1Settings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ContainerAnalysisV1Beta1Settings/getDefaultServiceScopes )))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisV1Beta1Settings this]
    (-> this (.setIamPolicySettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisV1Beta1Settings this]
    (-> this (.getIamPolicySettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisV1Beta1Settings this]
    (-> this (.testIamPermissionsSettings))))

(defn get-scan-config-settings
  "Returns the object with the settings used for calls to getScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.containeranalysis.v1beta1.GetScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisV1Beta1Settings this]
    (-> this (.getScanConfigSettings))))

(defn list-scan-configs-settings
  "Returns the object with the settings used for calls to listScanConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.containeranalysis.v1beta1.ListScanConfigsRequest,com.google.containeranalysis.v1beta1.ListScanConfigsResponse,com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ContainerAnalysisV1Beta1Settings this]
    (-> this (.listScanConfigsSettings))))

(defn update-scan-config-settings
  "Returns the object with the settings used for calls to updateScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.containeranalysis.v1beta1.UpdateScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContainerAnalysisV1Beta1Settings this]
    (-> this (.updateScanConfigSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings$Builder [^ContainerAnalysisV1Beta1Settings this]
    (-> this (.toBuilder))))


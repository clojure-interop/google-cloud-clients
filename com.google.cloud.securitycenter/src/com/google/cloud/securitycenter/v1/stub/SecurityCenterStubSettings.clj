(ns com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings
  "Settings class to configure an instance of SecurityCenterStub.

  The default instance has everything set to sensible defaults:


    The default service address (securitycenter.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createSource to 30 seconds:



  SecurityCenterStubSettings.Builder securityCenterSettingsBuilder =
      SecurityCenterStubSettings.newBuilder();
  securityCenterSettingsBuilder.createSourceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SecurityCenterStubSettings securityCenterSettings = securityCenterSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1.stub SecurityCenterStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SecurityCenterStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SecurityCenterStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SecurityCenterStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SecurityCenterStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (SecurityCenterStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SecurityCenterStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SecurityCenterStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings$Builder`"
  (^com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SecurityCenterStubSettings/newBuilder client-context))
  (^com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings$Builder []
    (SecurityCenterStubSettings/newBuilder )))

(defn list-findings-settings
  "Returns the object with the settings used for calls to listFindings.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.securitycenter.v1.ListFindingsRequest,com.google.cloud.securitycenter.v1.ListFindingsResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SecurityCenterStubSettings this]
    (-> this (.listFindingsSettings))))

(defn create-finding-settings
  "Returns the object with the settings used for calls to createFinding.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.CreateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.createFindingSettings))))

(defn get-source-settings
  "Returns the object with the settings used for calls to getSource.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.GetSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.getSourceSettings))))

(defn run-asset-discovery-settings
  "Returns the object with the settings used for calls to runAssetDiscovery.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.runAssetDiscoverySettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.securitycenter.v1.stub.SecurityCenterStub`

  throws: java.io.IOException"
  ([^SecurityCenterStubSettings this]
    (-> this (.createStub))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn update-security-marks-settings
  "Returns the object with the settings used for calls to updateSecurityMarks.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.UpdateSecurityMarksRequest,com.google.cloud.securitycenter.v1.SecurityMarks>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.updateSecurityMarksSettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.setIamPolicySettings))))

(defn run-asset-discovery-operation-settings
  "Returns the object with the settings used for calls to runAssetDiscovery.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse,com.google.protobuf.Empty>`"
  ([^SecurityCenterStubSettings this]
    (-> this (.runAssetDiscoveryOperationSettings))))

(defn list-assets-settings
  "Returns the object with the settings used for calls to listAssets.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.securitycenter.v1.ListAssetsRequest,com.google.cloud.securitycenter.v1.ListAssetsResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SecurityCenterStubSettings this]
    (-> this (.listAssetsSettings))))

(defn set-finding-state-settings
  "Returns the object with the settings used for calls to setFindingState.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.SetFindingStateRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.setFindingStateSettings))))

(defn group-findings-settings
  "Returns the object with the settings used for calls to groupFindings.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.securitycenter.v1.GroupFindingsRequest,com.google.cloud.securitycenter.v1.GroupFindingsResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SecurityCenterStubSettings this]
    (-> this (.groupFindingsSettings))))

(defn update-organization-settings-settings
  "Returns the object with the settings used for calls to updateOrganizationSettings.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.updateOrganizationSettingsSettings))))

(defn update-finding-settings
  "Returns the object with the settings used for calls to updateFinding.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.UpdateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.updateFindingSettings))))

(defn group-assets-settings
  "Returns the object with the settings used for calls to groupAssets.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.securitycenter.v1.GroupAssetsRequest,com.google.cloud.securitycenter.v1.GroupAssetsResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SecurityCenterStubSettings this]
    (-> this (.groupAssetsSettings))))

(defn update-source-settings
  "Returns the object with the settings used for calls to updateSource.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.UpdateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.updateSourceSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.getIamPolicySettings))))

(defn create-source-settings
  "Returns the object with the settings used for calls to createSource.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.CreateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.createSourceSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings$Builder`"
  (^com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings$Builder [^SecurityCenterStubSettings this]
    (-> this (.toBuilder))))

(defn list-sources-settings
  "Returns the object with the settings used for calls to listSources.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.securitycenter.v1.ListSourcesRequest,com.google.cloud.securitycenter.v1.ListSourcesResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SecurityCenterStubSettings this]
    (-> this (.listSourcesSettings))))

(defn get-organization-settings-settings
  "Returns the object with the settings used for calls to getOrganizationSettings.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.securitycenter.v1.GetOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityCenterStubSettings this]
    (-> this (.getOrganizationSettingsSettings))))


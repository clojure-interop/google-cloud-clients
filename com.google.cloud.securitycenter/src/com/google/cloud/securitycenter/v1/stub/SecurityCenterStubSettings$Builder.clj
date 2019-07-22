(ns com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings$Builder
  "Builder for SecurityCenterStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1.stub SecurityCenterStubSettings$Builder]))

(defn list-findings-settings
  "Returns the builder for the settings used for calls to listFindings.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.securitycenter.v1.ListFindingsRequest,com.google.cloud.securitycenter.v1.ListFindingsResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.listFindingsSettings))))

(defn create-finding-settings
  "Returns the builder for the settings used for calls to createFinding.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.CreateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.createFindingSettings))))

(defn get-source-settings
  "Returns the builder for the settings used for calls to getSource.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.GetSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.getSourceSettings))))

(defn run-asset-discovery-settings
  "Returns the builder for the settings used for calls to runAssetDiscovery.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.runAssetDiscoverySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings$Builder [^SecurityCenterStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn update-security-marks-settings
  "Returns the builder for the settings used for calls to updateSecurityMarks.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.UpdateSecurityMarksRequest,com.google.cloud.securitycenter.v1.SecurityMarks>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.updateSecurityMarksSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn run-asset-discovery-operation-settings
  "Returns the builder for the settings used for calls to runAssetDiscovery.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse,com.google.protobuf.Empty>`"
  ([^SecurityCenterStubSettings$Builder this]
    (-> this (.runAssetDiscoveryOperationSettings))))

(defn build
  "returns: `com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings [^SecurityCenterStubSettings$Builder this]
    (-> this (.build))))

(defn list-assets-settings
  "Returns the builder for the settings used for calls to listAssets.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.securitycenter.v1.ListAssetsRequest,com.google.cloud.securitycenter.v1.ListAssetsResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.listAssetsSettings))))

(defn set-finding-state-settings
  "Returns the builder for the settings used for calls to setFindingState.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.SetFindingStateRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.setFindingStateSettings))))

(defn group-findings-settings
  "Returns the builder for the settings used for calls to groupFindings.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.securitycenter.v1.GroupFindingsRequest,com.google.cloud.securitycenter.v1.GroupFindingsResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.groupFindingsSettings))))

(defn update-organization-settings-settings
  "Returns the builder for the settings used for calls to updateOrganizationSettings.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.updateOrganizationSettingsSettings))))

(defn update-finding-settings
  "Returns the builder for the settings used for calls to updateFinding.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.UpdateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.updateFindingSettings))))

(defn group-assets-settings
  "Returns the builder for the settings used for calls to groupAssets.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.securitycenter.v1.GroupAssetsRequest,com.google.cloud.securitycenter.v1.GroupAssetsResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.groupAssetsSettings))))

(defn update-source-settings
  "Returns the builder for the settings used for calls to updateSource.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.UpdateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.updateSourceSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^SecurityCenterStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn create-source-settings
  "Returns the builder for the settings used for calls to createSource.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.CreateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.createSourceSettings))))

(defn list-sources-settings
  "Returns the builder for the settings used for calls to listSources.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.securitycenter.v1.ListSourcesRequest,com.google.cloud.securitycenter.v1.ListSourcesResponse,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.listSourcesSettings))))

(defn get-organization-settings-settings
  "Returns the builder for the settings used for calls to getOrganizationSettings.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.securitycenter.v1.GetOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityCenterStubSettings$Builder this]
    (-> this (.getOrganizationSettingsSettings))))


(ns com.google.cloud.securitycenter.v1.stub.SecurityCenterStub
  "Base stub class for Cloud Security Command Center API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1.stub SecurityCenterStub]))

(defn ->security-center-stub
  "Constructor."
  (^SecurityCenterStub []
    (new SecurityCenterStub )))

(defn list-sources-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListSourcesRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.listSourcesPagedCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.getIamPolicyCallable))))

(defn update-source-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.updateSourceCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^SecurityCenterStub this]
    (-> this (.getOperationsStub))))

(defn update-organization-settings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.updateOrganizationSettingsCallable))))

(defn run-asset-discovery-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.runAssetDiscoveryCallable))))

(defn list-findings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListFindingsRequest,com.google.cloud.securitycenter.v1.ListFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.listFindingsCallable))))

(defn group-findings-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupFindingsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.groupFindingsPagedCallable))))

(defn update-finding-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.updateFindingCallable))))

(defn list-findings-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListFindingsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.listFindingsPagedCallable))))

(defn list-assets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListAssetsRequest,com.google.cloud.securitycenter.v1.ListAssetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.listAssetsCallable))))

(defn get-source-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GetSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.getSourceCallable))))

(defn group-assets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupAssetsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.groupAssetsPagedCallable))))

(defn run-asset-discovery-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse,com.google.protobuf.Empty>`"
  ([^SecurityCenterStub this]
    (-> this (.runAssetDiscoveryOperationCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^SecurityCenterStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.testIamPermissionsCallable))))

(defn update-security-marks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateSecurityMarksRequest,com.google.cloud.securitycenter.v1.SecurityMarks>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.updateSecurityMarksCallable))))

(defn group-findings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupFindingsRequest,com.google.cloud.securitycenter.v1.GroupFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.groupFindingsCallable))))

(defn create-source-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.CreateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.createSourceCallable))))

(defn list-sources-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListSourcesRequest,com.google.cloud.securitycenter.v1.ListSourcesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.listSourcesCallable))))

(defn group-assets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupAssetsRequest,com.google.cloud.securitycenter.v1.GroupAssetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.groupAssetsCallable))))

(defn set-finding-state-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.SetFindingStateRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.setFindingStateCallable))))

(defn create-finding-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.CreateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.createFindingCallable))))

(defn get-organization-settings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GetOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.getOrganizationSettingsCallable))))

(defn list-assets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListAssetsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterStub this]
    (-> this (.listAssetsPagedCallable))))


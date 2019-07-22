(ns com.google.cloud.securitycenter.v1.stub.GrpcSecurityCenterStub
  "gRPC stub implementation for Cloud Security Command Center API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1.stub GrpcSecurityCenterStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.securitycenter.v1.stub.GrpcSecurityCenterStub`

  throws: java.io.IOException"
  (^com.google.cloud.securitycenter.v1.stub.GrpcSecurityCenterStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcSecurityCenterStub/create client-context callable-factory))
  (^com.google.cloud.securitycenter.v1.stub.GrpcSecurityCenterStub [^com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings settings]
    (GrpcSecurityCenterStub/create settings)))

(defn list-sources-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListSourcesRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.listSourcesPagedCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.getIamPolicyCallable))))

(defn update-source-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.updateSourceCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcSecurityCenterStub this]
    (-> this (.getOperationsStub))))

(defn update-organization-settings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.updateOrganizationSettingsCallable))))

(defn run-asset-discovery-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.runAssetDiscoveryCallable))))

(defn list-findings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListFindingsRequest,com.google.cloud.securitycenter.v1.ListFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.listFindingsCallable))))

(defn group-findings-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupFindingsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.groupFindingsPagedCallable))))

(defn update-finding-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.updateFindingCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcSecurityCenterStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcSecurityCenterStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcSecurityCenterStub this]
    (-> this (.shutdown))))

(defn list-findings-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListFindingsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.listFindingsPagedCallable))))

(defn list-assets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListAssetsRequest,com.google.cloud.securitycenter.v1.ListAssetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.listAssetsCallable))))

(defn get-source-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GetSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.getSourceCallable))))

(defn group-assets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupAssetsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.groupAssetsPagedCallable))))

(defn run-asset-discovery-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse,com.google.protobuf.Empty>`"
  ([^GrpcSecurityCenterStub this]
    (-> this (.runAssetDiscoveryOperationCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^GrpcSecurityCenterStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.testIamPermissionsCallable))))

(defn update-security-marks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateSecurityMarksRequest,com.google.cloud.securitycenter.v1.SecurityMarks>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.updateSecurityMarksCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcSecurityCenterStub this]
    (-> this (.isTerminated))))

(defn group-findings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupFindingsRequest,com.google.cloud.securitycenter.v1.GroupFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.groupFindingsCallable))))

(defn create-source-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.CreateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.createSourceCallable))))

(defn list-sources-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListSourcesRequest,com.google.cloud.securitycenter.v1.ListSourcesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.listSourcesCallable))))

(defn group-assets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupAssetsRequest,com.google.cloud.securitycenter.v1.GroupAssetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.groupAssetsCallable))))

(defn set-finding-state-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.SetFindingStateRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.setFindingStateCallable))))

(defn create-finding-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.CreateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.createFindingCallable))))

(defn get-organization-settings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GetOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.getOrganizationSettingsCallable))))

(defn list-assets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListAssetsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSecurityCenterStub this]
    (-> this (.listAssetsPagedCallable))))

(defn shutdown-now
  ""
  ([^GrpcSecurityCenterStub this]
    (-> this (.shutdownNow))))


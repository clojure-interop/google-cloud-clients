(ns com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1Stub
  "Base stub class for Container Analysis API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1.stub ContainerAnalysisV1Beta1Stub]))

(defn ->container-analysis-v-1-beta-1-stub
  "Constructor."
  (^ContainerAnalysisV1Beta1Stub []
    (new ContainerAnalysisV1Beta1Stub )))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Stub this]
    (-> this (.setIamPolicyCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Stub this]
    (-> this (.getIamPolicyCallable))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Stub this]
    (-> this (.testIamPermissionsCallable))))

(defn get-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.GetScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Stub this]
    (-> this (.getScanConfigCallable))))

(defn list-scan-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.ListScanConfigsRequest,com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Stub this]
    (-> this (.listScanConfigsPagedCallable))))

(defn list-scan-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.ListScanConfigsRequest,com.google.containeranalysis.v1beta1.ListScanConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Stub this]
    (-> this (.listScanConfigsCallable))))

(defn update-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.UpdateScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Stub this]
    (-> this (.updateScanConfigCallable))))

(defn close
  ""
  ([^ContainerAnalysisV1Beta1Stub this]
    (-> this (.close))))


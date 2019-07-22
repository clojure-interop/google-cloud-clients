(ns com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStub
  "Base stub class for Container Analysis API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1.stub ContainerAnalysisStub]))

(defn ->container-analysis-stub
  "Constructor."
  (^ContainerAnalysisStub []
    (new ContainerAnalysisStub )))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisStub this]
    (-> this (.setIamPolicyCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisStub this]
    (-> this (.getIamPolicyCallable))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisStub this]
    (-> this (.testIamPermissionsCallable))))

(defn close
  ""
  ([^ContainerAnalysisStub this]
    (-> this (.close))))


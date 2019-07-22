(ns com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStub
  "Base stub class for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub AlertPolicyServiceStub]))

(defn ->alert-policy-service-stub
  "Constructor."
  (^AlertPolicyServiceStub []
    (new AlertPolicyServiceStub )))

(defn list-alert-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListAlertPoliciesRequest,com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceStub this]
    (-> this (.listAlertPoliciesPagedCallable))))

(defn list-alert-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListAlertPoliciesRequest,com.google.monitoring.v3.ListAlertPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceStub this]
    (-> this (.listAlertPoliciesCallable))))

(defn get-alert-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceStub this]
    (-> this (.getAlertPolicyCallable))))

(defn create-alert-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceStub this]
    (-> this (.createAlertPolicyCallable))))

(defn delete-alert-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteAlertPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceStub this]
    (-> this (.deleteAlertPolicyCallable))))

(defn update-alert-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceStub this]
    (-> this (.updateAlertPolicyCallable))))

(defn close
  ""
  ([^AlertPolicyServiceStub this]
    (-> this (.close))))


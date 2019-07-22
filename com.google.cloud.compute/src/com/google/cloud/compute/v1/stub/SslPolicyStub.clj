(ns com.google.cloud.compute.v1.stub.SslPolicyStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SslPolicyStub]))

(defn ->ssl-policy-stub
  "Constructor."
  (^SslPolicyStub []
    (new SslPolicyStub )))

(defn delete-ssl-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyStub this]
    (-> this (.deleteSslPolicyCallable))))

(defn get-ssl-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSslPolicyHttpRequest,com.google.cloud.compute.v1.SslPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyStub this]
    (-> this (.getSslPolicyCallable))))

(defn insert-ssl-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyStub this]
    (-> this (.insertSslPolicyCallable))))

(defn list-ssl-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPolicyClient$ListSslPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyStub this]
    (-> this (.listSslPoliciesPagedCallable))))

(defn list-ssl-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyStub this]
    (-> this (.listSslPoliciesCallable))))

(defn list-available-features-ssl-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAvailableFeaturesSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyStub this]
    (-> this (.listAvailableFeaturesSslPoliciesCallable))))

(defn patch-ssl-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyStub this]
    (-> this (.patchSslPolicyCallable))))

(defn close
  ""
  ([^SslPolicyStub this]
    (-> this (.close))))


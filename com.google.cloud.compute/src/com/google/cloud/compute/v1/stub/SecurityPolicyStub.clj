(ns com.google.cloud.compute.v1.stub.SecurityPolicyStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SecurityPolicyStub]))

(defn ->security-policy-stub
  "Constructor."
  (^SecurityPolicyStub []
    (new SecurityPolicyStub )))

(defn get-rule-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicyRule>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.getRuleSecurityPolicyCallable))))

(defn list-security-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.listSecurityPoliciesPagedCallable))))

(defn patch-rule-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.patchRuleSecurityPolicyCallable))))

(defn delete-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.deleteSecurityPolicyCallable))))

(defn patch-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.patchSecurityPolicyCallable))))

(defn insert-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.insertSecurityPolicyCallable))))

(defn close
  ""
  ([^SecurityPolicyStub this]
    (-> this (.close))))

(defn get-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.getSecurityPolicyCallable))))

(defn add-rule-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.addRuleSecurityPolicyCallable))))

(defn remove-rule-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.removeRuleSecurityPolicyCallable))))

(defn list-security-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyStub this]
    (-> this (.listSecurityPoliciesCallable))))


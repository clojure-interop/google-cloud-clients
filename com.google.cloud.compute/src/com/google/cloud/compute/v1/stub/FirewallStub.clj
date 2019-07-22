(ns com.google.cloud.compute.v1.stub.FirewallStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub FirewallStub]))

(defn ->firewall-stub
  "Constructor."
  (^FirewallStub []
    (new FirewallStub )))

(defn delete-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallStub this]
    (-> this (.deleteFirewallCallable))))

(defn get-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetFirewallHttpRequest,com.google.cloud.compute.v1.Firewall>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallStub this]
    (-> this (.getFirewallCallable))))

(defn insert-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallStub this]
    (-> this (.insertFirewallCallable))))

(defn list-firewalls-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListFirewallsHttpRequest,com.google.cloud.compute.v1.FirewallClient$ListFirewallsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallStub this]
    (-> this (.listFirewallsPagedCallable))))

(defn list-firewalls-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListFirewallsHttpRequest,com.google.cloud.compute.v1.FirewallList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallStub this]
    (-> this (.listFirewallsCallable))))

(defn patch-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallStub this]
    (-> this (.patchFirewallCallable))))

(defn update-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallStub this]
    (-> this (.updateFirewallCallable))))

(defn close
  ""
  ([^FirewallStub this]
    (-> this (.close))))


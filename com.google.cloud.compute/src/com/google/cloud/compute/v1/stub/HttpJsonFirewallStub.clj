(ns com.google.cloud.compute.v1.stub.HttpJsonFirewallStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonFirewallStub]))

(def *-delete-firewall-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteFirewallHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonFirewallStub/deleteFirewallMethodDescriptor)

(def *-get-firewall-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetFirewallHttpRequest,com.google.cloud.compute.v1.Firewall>"
  HttpJsonFirewallStub/getFirewallMethodDescriptor)

(def *-insert-firewall-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertFirewallHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonFirewallStub/insertFirewallMethodDescriptor)

(def *-list-firewalls-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListFirewallsHttpRequest,com.google.cloud.compute.v1.FirewallList>"
  HttpJsonFirewallStub/listFirewallsMethodDescriptor)

(def *-patch-firewall-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchFirewallHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonFirewallStub/patchFirewallMethodDescriptor)

(def *-update-firewall-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateFirewallHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonFirewallStub/updateFirewallMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonFirewallStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonFirewallStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonFirewallStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonFirewallStub [^com.google.cloud.compute.v1.stub.FirewallStubSettings settings]
    (HttpJsonFirewallStub/create settings)))

(defn list-firewalls-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListFirewallsHttpRequest,com.google.cloud.compute.v1.FirewallList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonFirewallStub this]
    (-> this (.listFirewallsCallable))))

(defn insert-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonFirewallStub this]
    (-> this (.insertFirewallCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonFirewallStub this]
    (-> this (.isShutdown))))

(defn get-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetFirewallHttpRequest,com.google.cloud.compute.v1.Firewall>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonFirewallStub this]
    (-> this (.getFirewallCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonFirewallStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonFirewallStub this]
    (-> this (.shutdown))))

(defn delete-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonFirewallStub this]
    (-> this (.deleteFirewallCallable))))

(defn close
  ""
  ([^HttpJsonFirewallStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonFirewallStub this]
    (-> this (.isTerminated))))

(defn update-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonFirewallStub this]
    (-> this (.updateFirewallCallable))))

(defn patch-firewall-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonFirewallStub this]
    (-> this (.patchFirewallCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonFirewallStub this]
    (-> this (.shutdownNow))))

(defn list-firewalls-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListFirewallsHttpRequest,com.google.cloud.compute.v1.FirewallClient$ListFirewallsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonFirewallStub this]
    (-> this (.listFirewallsPagedCallable))))


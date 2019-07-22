(ns com.google.cloud.compute.v1.stub.HttpJsonSslPolicyStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonSslPolicyStub]))

(def *-delete-ssl-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSslPolicyStub/deleteSslPolicyMethodDescriptor)

(def *-get-ssl-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetSslPolicyHttpRequest,com.google.cloud.compute.v1.SslPolicy>"
  HttpJsonSslPolicyStub/getSslPolicyMethodDescriptor)

(def *-insert-ssl-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSslPolicyStub/insertSslPolicyMethodDescriptor)

(def *-list-ssl-policies-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesList>"
  HttpJsonSslPolicyStub/listSslPoliciesMethodDescriptor)

(def *-list-available-features-ssl-policies-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListAvailableFeaturesSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse>"
  HttpJsonSslPolicyStub/listAvailableFeaturesSslPoliciesMethodDescriptor)

(def *-patch-ssl-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSslPolicyStub/patchSslPolicyMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonSslPolicyStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonSslPolicyStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonSslPolicyStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonSslPolicyStub [^com.google.cloud.compute.v1.stub.SslPolicyStubSettings settings]
    (HttpJsonSslPolicyStub/create settings)))

(defn insert-ssl-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslPolicyStub this]
    (-> this (.insertSslPolicyCallable))))

(defn list-ssl-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPolicyClient$ListSslPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslPolicyStub this]
    (-> this (.listSslPoliciesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSslPolicyStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonSslPolicyStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonSslPolicyStub this]
    (-> this (.shutdown))))

(defn get-ssl-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSslPolicyHttpRequest,com.google.cloud.compute.v1.SslPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslPolicyStub this]
    (-> this (.getSslPolicyCallable))))

(defn patch-ssl-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslPolicyStub this]
    (-> this (.patchSslPolicyCallable))))

(defn close
  ""
  ([^HttpJsonSslPolicyStub this]
    (-> this (.close))))

(defn list-ssl-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslPolicyStub this]
    (-> this (.listSslPoliciesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSslPolicyStub this]
    (-> this (.isTerminated))))

(defn delete-ssl-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslPolicyStub this]
    (-> this (.deleteSslPolicyCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonSslPolicyStub this]
    (-> this (.shutdownNow))))

(defn list-available-features-ssl-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAvailableFeaturesSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslPolicyStub this]
    (-> this (.listAvailableFeaturesSslPoliciesCallable))))


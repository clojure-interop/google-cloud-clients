(ns com.google.cloud.compute.v1.stub.HttpJsonGlobalAddressStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonGlobalAddressStub]))

(def *-delete-global-address-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonGlobalAddressStub/deleteGlobalAddressMethodDescriptor)

(def *-get-global-address-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetGlobalAddressHttpRequest,com.google.cloud.compute.v1.Address>"
  HttpJsonGlobalAddressStub/getGlobalAddressMethodDescriptor)

(def *-insert-global-address-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonGlobalAddressStub/insertGlobalAddressMethodDescriptor)

(def *-list-global-addresses-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.AddressList>"
  HttpJsonGlobalAddressStub/listGlobalAddressesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonGlobalAddressStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonGlobalAddressStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonGlobalAddressStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonGlobalAddressStub [^com.google.cloud.compute.v1.stub.GlobalAddressStubSettings settings]
    (HttpJsonGlobalAddressStub/create settings)))

(defn list-global-addresses-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.AddressList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalAddressStub this]
    (-> this (.listGlobalAddressesCallable))))

(defn delete-global-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalAddressStub this]
    (-> this (.deleteGlobalAddressCallable))))

(defn get-global-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetGlobalAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalAddressStub this]
    (-> this (.getGlobalAddressCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonGlobalAddressStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonGlobalAddressStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonGlobalAddressStub this]
    (-> this (.shutdown))))

(defn insert-global-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalAddressStub this]
    (-> this (.insertGlobalAddressCallable))))

(defn close
  ""
  ([^HttpJsonGlobalAddressStub this]
    (-> this (.close))))

(defn list-global-addresses-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.GlobalAddressClient$ListGlobalAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalAddressStub this]
    (-> this (.listGlobalAddressesPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonGlobalAddressStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonGlobalAddressStub this]
    (-> this (.shutdownNow))))


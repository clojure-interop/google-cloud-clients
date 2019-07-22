(ns com.google.cloud.compute.v1.stub.HttpJsonRegionBackendServiceCallableFactory
  "HTTP callable factory implementation for compute.

  This class is for advanced usage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionBackendServiceCallableFactory]))

(defn ->http-json-region-backend-service-callable-factory
  "Constructor."
  (^HttpJsonRegionBackendServiceCallableFactory []
    (new HttpJsonRegionBackendServiceCallableFactory )))

(defn create-unary-callable
  "http-json-call-settings - `com.google.api.gax.httpjson.HttpJsonCallSettings`
  call-settings - `com.google.api.gax.rpc.UnaryCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `<RequestT,ResponseT> com.google.api.gax.rpc.UnaryCallable<RequestT,ResponseT>`"
  ([^HttpJsonRegionBackendServiceCallableFactory this ^com.google.api.gax.httpjson.HttpJsonCallSettings http-json-call-settings ^com.google.api.gax.rpc.UnaryCallSettings call-settings ^com.google.api.gax.rpc.ClientContext client-context]
    (-> this (.createUnaryCallable http-json-call-settings call-settings client-context))))

(defn create-operation-callable
  "http-json-call-settings - `com.google.api.gax.httpjson.HttpJsonCallSettings`
  operation-call-settings - `com.google.api.gax.rpc.OperationCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`
  operations-stub - `com.google.api.gax.core.BackgroundResource`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   <RequestT,ResponseT,MetadataT> com.google.api.gax.rpc.OperationCallable<RequestT,ResponseT,MetadataT>`"
  ([^HttpJsonRegionBackendServiceCallableFactory this ^com.google.api.gax.httpjson.HttpJsonCallSettings http-json-call-settings ^com.google.api.gax.rpc.OperationCallSettings operation-call-settings ^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.core.BackgroundResource operations-stub]
    (-> this (.createOperationCallable http-json-call-settings operation-call-settings client-context operations-stub))))

(defn create-paged-callable
  "http-json-call-settings - `com.google.api.gax.httpjson.HttpJsonCallSettings`
  paged-call-settings - `com.google.api.gax.rpc.PagedCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `<RequestT,ResponseT,PagedListResponseT> com.google.api.gax.rpc.UnaryCallable<RequestT,PagedListResponseT>`"
  ([^HttpJsonRegionBackendServiceCallableFactory this ^com.google.api.gax.httpjson.HttpJsonCallSettings http-json-call-settings ^com.google.api.gax.rpc.PagedCallSettings paged-call-settings ^com.google.api.gax.rpc.ClientContext client-context]
    (-> this (.createPagedCallable http-json-call-settings paged-call-settings client-context))))

(defn create-batching-callable
  "http-json-call-settings - `com.google.api.gax.httpjson.HttpJsonCallSettings`
  batching-call-settings - `com.google.api.gax.rpc.BatchingCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `<RequestT,ResponseT> com.google.api.gax.rpc.UnaryCallable<RequestT,ResponseT>`"
  ([^HttpJsonRegionBackendServiceCallableFactory this ^com.google.api.gax.httpjson.HttpJsonCallSettings http-json-call-settings ^com.google.api.gax.rpc.BatchingCallSettings batching-call-settings ^com.google.api.gax.rpc.ClientContext client-context]
    (-> this (.createBatchingCallable http-json-call-settings batching-call-settings client-context))))


(ns com.google.cloud.compute.v1.stub.HttpJsonRegionBackendServiceStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionBackendServiceStub]))

(def *-delete-region-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionBackendServiceStub/deleteRegionBackendServiceMethodDescriptor)

(def *-get-region-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>"
  HttpJsonRegionBackendServiceStub/getRegionBackendServiceMethodDescriptor)

(def *-get-health-region-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetHealthRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>"
  HttpJsonRegionBackendServiceStub/getHealthRegionBackendServiceMethodDescriptor)

(def *-insert-region-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionBackendServiceStub/insertRegionBackendServiceMethodDescriptor)

(def *-list-region-backend-services-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRegionBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList>"
  HttpJsonRegionBackendServiceStub/listRegionBackendServicesMethodDescriptor)

(def *-patch-region-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionBackendServiceStub/patchRegionBackendServiceMethodDescriptor)

(def *-update-region-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionBackendServiceStub/updateRegionBackendServiceMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRegionBackendServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionBackendServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRegionBackendServiceStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionBackendServiceStub [^com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings settings]
    (HttpJsonRegionBackendServiceStub/create settings)))

(defn list-region-backend-services-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionBackendServiceStub this]
    (-> this (.listRegionBackendServicesCallable))))

(defn patch-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionBackendServiceStub this]
    (-> this (.patchRegionBackendServiceCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionBackendServiceStub this]
    (-> this (.isShutdown))))

(defn get-health-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionBackendServiceStub this]
    (-> this (.getHealthRegionBackendServiceCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRegionBackendServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-region-backend-services-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionBackendServicesHttpRequest,com.google.cloud.compute.v1.RegionBackendServiceClient$ListRegionBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionBackendServiceStub this]
    (-> this (.listRegionBackendServicesPagedCallable))))

(defn shutdown
  ""
  ([^HttpJsonRegionBackendServiceStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonRegionBackendServiceStub this]
    (-> this (.close))))

(defn update-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionBackendServiceStub this]
    (-> this (.updateRegionBackendServiceCallable))))

(defn insert-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionBackendServiceStub this]
    (-> this (.insertRegionBackendServiceCallable))))

(defn get-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionBackendServiceStub this]
    (-> this (.getRegionBackendServiceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionBackendServiceStub this]
    (-> this (.isTerminated))))

(defn delete-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionBackendServiceStub this]
    (-> this (.deleteRegionBackendServiceCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonRegionBackendServiceStub this]
    (-> this (.shutdownNow))))


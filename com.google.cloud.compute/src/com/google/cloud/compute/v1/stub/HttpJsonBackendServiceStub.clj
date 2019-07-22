(ns com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonBackendServiceStub]))

(def *-add-signed-url-key-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AddSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendServiceStub/addSignedUrlKeyBackendServiceMethodDescriptor)

(def *-aggregated-list-backend-services-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceAggregatedList>"
  HttpJsonBackendServiceStub/aggregatedListBackendServicesMethodDescriptor)

(def *-delete-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendServiceStub/deleteBackendServiceMethodDescriptor)

(def *-delete-signed-url-key-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendServiceStub/deleteSignedUrlKeyBackendServiceMethodDescriptor)

(def *-get-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>"
  HttpJsonBackendServiceStub/getBackendServiceMethodDescriptor)

(def *-get-health-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetHealthBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>"
  HttpJsonBackendServiceStub/getHealthBackendServiceMethodDescriptor)

(def *-insert-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendServiceStub/insertBackendServiceMethodDescriptor)

(def *-list-backend-services-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList>"
  HttpJsonBackendServiceStub/listBackendServicesMethodDescriptor)

(def *-patch-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendServiceStub/patchBackendServiceMethodDescriptor)

(def *-set-security-policy-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetSecurityPolicyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendServiceStub/setSecurityPolicyBackendServiceMethodDescriptor)

(def *-update-backend-service-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendServiceStub/updateBackendServiceMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonBackendServiceStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub [^com.google.cloud.compute.v1.stub.BackendServiceStubSettings settings]
    (HttpJsonBackendServiceStub/create settings)))

(defn list-backend-services-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceClient$ListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.listBackendServicesPagedCallable))))

(defn add-signed-url-key-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.addSignedUrlKeyBackendServiceCallable))))

(defn insert-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.insertBackendServiceCallable))))

(defn delete-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.deleteBackendServiceCallable))))

(defn update-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.updateBackendServiceCallable))))

(defn aggregated-list-backend-services-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.aggregatedListBackendServicesCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonBackendServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonBackendServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn patch-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.patchBackendServiceCallable))))

(defn shutdown
  ""
  ([^HttpJsonBackendServiceStub this]
    (-> this (.shutdown))))

(defn list-backend-services-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.listBackendServicesCallable))))

(defn get-health-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.getHealthBackendServiceCallable))))

(defn aggregated-list-backend-services-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceClient$AggregatedListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.aggregatedListBackendServicesPagedCallable))))

(defn close
  ""
  ([^HttpJsonBackendServiceStub this]
    (-> this (.close))))

(defn delete-signed-url-key-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.deleteSignedUrlKeyBackendServiceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonBackendServiceStub this]
    (-> this (.isTerminated))))

(defn set-security-policy-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSecurityPolicyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.setSecurityPolicyBackendServiceCallable))))

(defn get-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendServiceStub this]
    (-> this (.getBackendServiceCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonBackendServiceStub this]
    (-> this (.shutdownNow))))


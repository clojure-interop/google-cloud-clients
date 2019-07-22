(ns com.google.cloud.grpc.BaseGrpcServiceException
  "Base class for all exceptions from grpc-based services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.grpc BaseGrpcServiceException]))

(defn ->base-grpc-service-exception
  "Constructor.

  api-exception - `com.google.api.gax.rpc.ApiException`"
  (^BaseGrpcServiceException [^com.google.api.gax.rpc.ApiException api-exception]
    (new BaseGrpcServiceException api-exception)))


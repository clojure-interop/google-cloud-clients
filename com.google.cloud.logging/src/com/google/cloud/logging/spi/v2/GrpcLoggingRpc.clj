(ns com.google.cloud.logging.spi.v2.GrpcLoggingRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.spi.v2 GrpcLoggingRpc]))

(defn ->grpc-logging-rpc
  "Constructor.

  options - `com.google.cloud.logging.LoggingOptions`

  throws: java.io.IOException"
  (^GrpcLoggingRpc [^com.google.cloud.logging.LoggingOptions options]
    (new GrpcLoggingRpc options)))

(defn create
  "Description copied from interface: LoggingRpc

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.CreateSinkRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.LogSink>`"
  (^com.google.api.core.ApiFuture [^GrpcLoggingRpc this ^com.google.logging.v2.CreateSinkRequest request]
    (-> this (.create request))))

(defn update
  "Description copied from interface: LoggingRpc

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.UpdateSinkRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.LogSink>`"
  (^com.google.api.core.ApiFuture [^GrpcLoggingRpc this ^com.google.logging.v2.UpdateSinkRequest request]
    (-> this (.update request))))

(defn get
  "Description copied from interface: LoggingRpc

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.GetSinkRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.LogSink>`"
  (^com.google.api.core.ApiFuture [^GrpcLoggingRpc this ^com.google.logging.v2.GetSinkRequest request]
    (-> this (.get request))))

(defn list
  "Description copied from interface: LoggingRpc

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.ListSinksRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.ListSinksResponse>`"
  (^com.google.api.core.ApiFuture [^GrpcLoggingRpc this ^com.google.logging.v2.ListSinksRequest request]
    (-> this (.list request))))

(defn delete
  "Description copied from interface: LoggingRpc

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.DeleteSinkRequest`

  returns: `com.google.api.core.ApiFuture<com.google.protobuf.Empty>`"
  (^com.google.api.core.ApiFuture [^GrpcLoggingRpc this ^com.google.logging.v2.DeleteSinkRequest request]
    (-> this (.delete request))))

(defn write
  "Description copied from interface: LoggingRpc

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.WriteLogEntriesRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.WriteLogEntriesResponse>`"
  (^com.google.api.core.ApiFuture [^GrpcLoggingRpc this ^com.google.logging.v2.WriteLogEntriesRequest request]
    (-> this (.write request))))

(defn close
  "throws: java.lang.Exception"
  ([^GrpcLoggingRpc this]
    (-> this (.close))))


(ns com.google.cloud.logging.spi.v2.LoggingRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.spi.v2 LoggingRpc]))

(defn create
  "Sends a request to create a sink. This method returns a ApiFuture object to consume the
   result. Future.get() returns the created sink.

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.CreateSinkRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.LogSink>`"
  (^com.google.api.core.ApiFuture [^LoggingRpc this ^com.google.logging.v2.CreateSinkRequest request]
    (-> this (.create request))))

(defn update
  "Sends a request to update a sink. If the sink does not exist, it is created. This method
   returns a ApiFuture object to consume the result. Future.get() returns the
   updated or created sink.

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.UpdateSinkRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.LogSink>`"
  (^com.google.api.core.ApiFuture [^LoggingRpc this ^com.google.logging.v2.UpdateSinkRequest request]
    (-> this (.update request))))

(defn get
  "Sends a request to get a sink. This method returns a ApiFuture object to consume the
   result. Future.get() returns the requested sink or null if not found.

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.GetSinkRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.LogSink>`"
  (^com.google.api.core.ApiFuture [^LoggingRpc this ^com.google.logging.v2.GetSinkRequest request]
    (-> this (.get request))))

(defn list
  "Sends a request to list the sinks in a project. This method returns a ApiFuture object
   to consume the result. Future.get() returns a response object containing the listing
   result.

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.ListSinksRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.ListSinksResponse>`"
  (^com.google.api.core.ApiFuture [^LoggingRpc this ^com.google.logging.v2.ListSinksRequest request]
    (-> this (.list request))))

(defn delete
  "Sends a request to delete a sink. This method returns a ApiFuture object to consume the
   result. Future.get() returns Empty.getDefaultInstance() or null if
   the sink was not found.

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.DeleteSinkRequest`

  returns: `com.google.api.core.ApiFuture<com.google.protobuf.Empty>`"
  (^com.google.api.core.ApiFuture [^LoggingRpc this ^com.google.logging.v2.DeleteSinkRequest request]
    (-> this (.delete request))))

(defn write
  "Sends a request to write log entries to Stackdriver Logging. This method returns a ApiFuture object to consume the result. Future.get() returns a response object for
   the write operation.

  request - the request object containing all of the parameters for the API call - `com.google.logging.v2.WriteLogEntriesRequest`

  returns: `com.google.api.core.ApiFuture<com.google.logging.v2.WriteLogEntriesResponse>`"
  (^com.google.api.core.ApiFuture [^LoggingRpc this ^com.google.logging.v2.WriteLogEntriesRequest request]
    (-> this (.write request))))


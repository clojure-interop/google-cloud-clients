(ns com.google.cloud.grpc.GrpcTransportOptions$ExecutorFactory
  "An interface for ExecutorService factories. Implementations of this interface can be
  used to provide an user-defined executor to execute requests. Any implementation of this
  interface must override the get() method to return the desired executor. The release(executor) method should be overriden to free resources used by the executor (if
  needed) according to application's logic.

  Implementation must provide a public no-arg constructor. Loading of a factory implementation
  is done via ServiceLoader."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.grpc GrpcTransportOptions$ExecutorFactory]))

(defn get
  "Gets an executor service instance.

  returns: `T`"
  ([^GrpcTransportOptions$ExecutorFactory this]
    (-> this (.get))))

(defn release
  "Releases resources used by the executor and possibly shuts it down.

  executor - `T`"
  ([^GrpcTransportOptions$ExecutorFactory this executor]
    (-> this (.release executor))))


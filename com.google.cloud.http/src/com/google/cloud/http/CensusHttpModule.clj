(ns com.google.cloud.http.CensusHttpModule
  "Provides utilities for Open Census to record http stats/trace information and propagate tracing
  context."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.http CensusHttpModule]))

(defn ->census-http-module
  "Constructor.

  Creates a CensusHttpModule with given parameters.

  tracer - the OpenCensus Tracer. - `io.opencensus.trace.Tracer`
  is-record-events - whether spans are stored locally. - `boolean`"
  (^CensusHttpModule [^io.opencensus.trace.Tracer tracer ^Boolean is-record-events]
    (new CensusHttpModule tracer is-record-events)))

(defn get-tracer
  "Returns the tracing component of OpenCensus.

  returns: the tracing component of OpenCensus. - `io.opencensus.trace.Tracer`"
  (^io.opencensus.trace.Tracer [^CensusHttpModule this]
    (-> this (.getTracer))))

(defn record-events?
  "Returns whether spans are stored locally.

  returns: whether spans are stored locally. - `boolean`"
  (^Boolean [^CensusHttpModule this]
    (-> this (.isRecordEvents))))

(defn get-http-request-initializer
  "Returns the HttpExecuteInterceptor used when initializing the HttpRequest.

  initializer - the original initializer which will be executed before this initializer. - `com.google.api.client.http.HttpRequestInitializer`

  returns: the HttpExecuteInterceptor. - `com.google.api.client.http.HttpRequestInitializer`"
  (^com.google.api.client.http.HttpRequestInitializer [^CensusHttpModule this ^com.google.api.client.http.HttpRequestInitializer initializer]
    (-> this (.getHttpRequestInitializer initializer))))


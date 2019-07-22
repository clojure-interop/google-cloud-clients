(ns com.google.cloud.pubsub.v1.OpenCensusUtil
  "Utilities for propagating OpenCensus TagContext and SpanContext from publishers
  to subscribers."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 OpenCensusUtil]))

(defn ->open-census-util
  "Constructor."
  (^OpenCensusUtil []
    (new OpenCensusUtil )))

(def *-tag-context-key
  "Static Constant.

  type: java.lang.String"
  OpenCensusUtil/TAG_CONTEXT_KEY)

(def *-trace-context-key
  "Static Constant.

  type: java.lang.String"
  OpenCensusUtil/TRACE_CONTEXT_KEY)

(def *-open-census-message-transform
  "Static Constant.

  Propagates active OpenCensus trace and tag contexts from the Publisher by adding them as
   attributes to the PubsubMessage.

  type: com.google.api.core.ApiFunction<com.google.pubsub.v1.PubsubMessage,com.google.pubsub.v1.PubsubMessage>"
  OpenCensusUtil/OPEN_CENSUS_MESSAGE_TRANSFORM)


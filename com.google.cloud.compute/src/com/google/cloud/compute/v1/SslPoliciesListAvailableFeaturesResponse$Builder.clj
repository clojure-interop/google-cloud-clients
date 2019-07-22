(ns com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslPoliciesListAvailableFeaturesResponse$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse`

  returns: `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder`"
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder [^SslPoliciesListAvailableFeaturesResponse$Builder this ^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse other]
    (-> this (.mergeFrom other))))

(defn get-features-list
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPoliciesListAvailableFeaturesResponse$Builder this]
    (-> this (.getFeaturesList))))

(defn add-all-features
  "features - `java.util.List`

  returns: `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder`"
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder [^SslPoliciesListAvailableFeaturesResponse$Builder this ^java.util.List features]
    (-> this (.addAllFeatures features))))

(defn add-features
  "features - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder`"
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder [^SslPoliciesListAvailableFeaturesResponse$Builder this ^java.lang.String features]
    (-> this (.addFeatures features))))

(defn build
  "returns: `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse`"
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse [^SslPoliciesListAvailableFeaturesResponse$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder`"
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder [^SslPoliciesListAvailableFeaturesResponse$Builder this]
    (-> this (.clone))))


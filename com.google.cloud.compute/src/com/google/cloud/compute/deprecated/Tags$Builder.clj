(ns com.google.cloud.compute.deprecated.Tags$Builder
  "A builder for Tags objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Tags$Builder]))

(defn set-values
  "Sets a list of tags to apply to an instance. Tags are used to identify valid sources or
   targets for network firewalls. Each tag within the list must comply with RFC1035.

  values - `java.lang.Iterable`

  returns: `com.google.cloud.compute.deprecated.Tags$Builder`"
  (^com.google.cloud.compute.deprecated.Tags$Builder [^Tags$Builder this ^java.lang.Iterable values]
    (-> this (.setValues values))))

(defn add
  "Adds a tag to the list of tags. Tags are used to identify valid sources or targets for
   network firewalls. The tag must comply with RFC1035.

  tag - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Tags$Builder`"
  (^com.google.cloud.compute.deprecated.Tags$Builder [^Tags$Builder this ^java.lang.String tag]
    (-> this (.add tag))))

(defn set-fingerprint
  "Sets the fingerprint for the tags. This value is needed to update instance's tags.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Tags$Builder`"
  (^com.google.cloud.compute.deprecated.Tags$Builder [^Tags$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn build
  "Creates a Tags object.

  returns: `com.google.cloud.compute.deprecated.Tags`"
  (^com.google.cloud.compute.deprecated.Tags [^Tags$Builder this]
    (-> this (.build))))


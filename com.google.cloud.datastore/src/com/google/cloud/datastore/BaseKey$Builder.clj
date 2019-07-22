(ns com.google.cloud.datastore.BaseKey$Builder
  "Base class for key builders."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore BaseKey$Builder]))

(defn add-ancestor
  "Adds an ancestor for this key.

  ancestor - `com.google.cloud.datastore.PathElement`

  returns: `B`"
  ([^BaseKey$Builder this ^com.google.cloud.datastore.PathElement ancestor]
    (-> this (.addAncestor ancestor))))

(defn add-ancestors
  "Adds the provided ancestors to the key.

  ancestor - `com.google.cloud.datastore.PathElement`
  other - `com.google.cloud.datastore.PathElement`

  returns: `B`"
  ([^BaseKey$Builder this ^com.google.cloud.datastore.PathElement ancestor ^com.google.cloud.datastore.PathElement other]
    (-> this (.addAncestors ancestor other)))
  ([^BaseKey$Builder this ^java.lang.Iterable ancestors]
    (-> this (.addAncestors ancestors))))

(defn set-kind
  "Sets the kind of the key.

  kind - `java.lang.String`

  returns: `B`"
  ([^BaseKey$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-project-id
  "Sets the project ID of the key.

  project-id - `java.lang.String`

  returns: `B`"
  ([^BaseKey$Builder this ^java.lang.String project-id]
    (-> this (.setProjectId project-id))))

(defn set-namespace
  "Sets the namespace of the key.

  namespace - `java.lang.String`

  returns: `B`"
  ([^BaseKey$Builder this ^java.lang.String namespace]
    (-> this (.setNamespace namespace))))


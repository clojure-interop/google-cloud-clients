(ns com.google.cloud.resourcemanager.Project$Builder
  "Builder for Project."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager Project$Builder]))

(defn set-name
  "Description copied from class: ProjectInfo.Builder

  name - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.Project$Builder`"
  (^com.google.cloud.resourcemanager.Project$Builder [^Project$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-project-id
  "Description copied from class: ProjectInfo.Builder

  project-id - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.Project$Builder`"
  (^com.google.cloud.resourcemanager.Project$Builder [^Project$Builder this ^java.lang.String project-id]
    (-> this (.setProjectId project-id))))

(defn add-label
  "Description copied from class: ProjectInfo.Builder

  key - `java.lang.String`
  value - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.Project$Builder`"
  (^com.google.cloud.resourcemanager.Project$Builder [^Project$Builder this ^java.lang.String key ^java.lang.String value]
    (-> this (.addLabel key value))))

(defn remove-label
  "Description copied from class: ProjectInfo.Builder

  key - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.Project$Builder`"
  (^com.google.cloud.resourcemanager.Project$Builder [^Project$Builder this ^java.lang.String key]
    (-> this (.removeLabel key))))

(defn clear-labels
  "Description copied from class: ProjectInfo.Builder

  returns: `com.google.cloud.resourcemanager.Project$Builder`"
  (^com.google.cloud.resourcemanager.Project$Builder [^Project$Builder this]
    (-> this (.clearLabels))))

(defn set-labels
  "Description copied from class: ProjectInfo.Builder

  labels - `java.util.Map`

  returns: `com.google.cloud.resourcemanager.Project$Builder`"
  (^com.google.cloud.resourcemanager.Project$Builder [^Project$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn set-parent
  "parent - `com.google.cloud.resourcemanager.ProjectInfo$ResourceId`

  returns: `com.google.cloud.resourcemanager.Project$Builder`"
  (^com.google.cloud.resourcemanager.Project$Builder [^Project$Builder this ^com.google.cloud.resourcemanager.ProjectInfo$ResourceId parent]
    (-> this (.setParent parent))))

(defn build
  "returns: `com.google.cloud.resourcemanager.Project`"
  (^com.google.cloud.resourcemanager.Project [^Project$Builder this]
    (-> this (.build))))


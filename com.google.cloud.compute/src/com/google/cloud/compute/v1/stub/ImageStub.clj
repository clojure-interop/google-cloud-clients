(ns com.google.cloud.compute.v1.stub.ImageStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ImageStub]))

(defn ->image-stub
  "Constructor."
  (^ImageStub []
    (new ImageStub )))

(defn deprecate-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeprecateImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.deprecateImageCallable))))

(defn list-images-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListImagesHttpRequest,com.google.cloud.compute.v1.ImageClient$ListImagesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.listImagesPagedCallable))))

(defn test-iam-permissions-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsImageHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.testIamPermissionsImageCallable))))

(defn set-labels-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.setLabelsImageCallable))))

(defn get-from-family-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetFromFamilyImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.getFromFamilyImageCallable))))

(defn insert-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.insertImageCallable))))

(defn close
  ""
  ([^ImageStub this]
    (-> this (.close))))

(defn list-images-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListImagesHttpRequest,com.google.cloud.compute.v1.ImageList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.listImagesCallable))))

(defn set-iam-policy-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.setIamPolicyImageCallable))))

(defn delete-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.deleteImageCallable))))

(defn get-iam-policy-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.getIamPolicyImageCallable))))

(defn get-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageStub this]
    (-> this (.getImageCallable))))


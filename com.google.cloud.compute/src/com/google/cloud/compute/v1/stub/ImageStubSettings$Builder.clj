(ns com.google.cloud.compute.v1.stub.ImageStubSettings$Builder
  "Builder for ImageStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ImageStubSettings$Builder]))

(defn set-labels-image-settings
  "Returns the builder for the settings used for calls to setLabelsImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetLabelsImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.setLabelsImageSettings))))

(defn get-image-settings
  "Returns the builder for the settings used for calls to getImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.getImageSettings))))

(defn test-iam-permissions-image-settings
  "Returns the builder for the settings used for calls to testIamPermissionsImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsImageHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.testIamPermissionsImageSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.ImageStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.ImageStubSettings$Builder [^ImageStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn deprecate-image-settings
  "Returns the builder for the settings used for calls to deprecateImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeprecateImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.deprecateImageSettings))))

(defn get-from-family-image-settings
  "Returns the builder for the settings used for calls to getFromFamilyImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetFromFamilyImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.getFromFamilyImageSettings))))

(defn insert-image-settings
  "Returns the builder for the settings used for calls to insertImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.insertImageSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.ImageStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.ImageStubSettings [^ImageStubSettings$Builder this]
    (-> this (.build))))

(defn get-iam-policy-image-settings
  "Returns the builder for the settings used for calls to getIamPolicyImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.getIamPolicyImageSettings))))

(defn delete-image-settings
  "Returns the builder for the settings used for calls to deleteImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.deleteImageSettings))))

(defn set-iam-policy-image-settings
  "Returns the builder for the settings used for calls to setIamPolicyImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.setIamPolicyImageSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ImageStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-images-settings
  "Returns the builder for the settings used for calls to listImages.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListImagesHttpRequest,com.google.cloud.compute.v1.ImageList,com.google.cloud.compute.v1.ImageClient$ListImagesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ImageStubSettings$Builder this]
    (-> this (.listImagesSettings))))


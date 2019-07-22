# Bindings for com.google.cloud.storage

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.storage "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.google.cloud.storage.Acl$Builder**
- class **com.google.cloud.storage.Acl$Domain**
- enum **com.google.cloud.storage.Acl$Entity$Type**
- class **com.google.cloud.storage.Acl$Entity**
- class **com.google.cloud.storage.Acl$Group**
- class **com.google.cloud.storage.Acl$Project$ProjectRole**
- class **com.google.cloud.storage.Acl$Project**
- class **com.google.cloud.storage.Acl$RawEntity**
- class **com.google.cloud.storage.Acl$Role**
- class **com.google.cloud.storage.Acl$User**
- class **com.google.cloud.storage.Acl**
- class **com.google.cloud.storage.Blob$BlobSourceOption**
- class **com.google.cloud.storage.Blob$Builder**
- class **com.google.cloud.storage.Blob**
- class **com.google.cloud.storage.BlobId**
- class **com.google.cloud.storage.BlobInfo$Builder**
- class **com.google.cloud.storage.BlobInfo$CustomerEncryption**
- class **com.google.cloud.storage.BlobInfo$ImmutableEmptyMap**
- class **com.google.cloud.storage.BlobInfo**
- class **com.google.cloud.storage.Bucket$BlobTargetOption**
- class **com.google.cloud.storage.Bucket$BlobWriteOption**
- class **com.google.cloud.storage.Bucket$BucketSourceOption**
- class **com.google.cloud.storage.Bucket$Builder**
- class **com.google.cloud.storage.Bucket**
- class **com.google.cloud.storage.BucketInfo$AgeDeleteRule**
- class **com.google.cloud.storage.BucketInfo$Builder**
- class **com.google.cloud.storage.BucketInfo$CreatedBeforeDeleteRule**
- enum **com.google.cloud.storage.BucketInfo$DeleteRule$Type**
- class **com.google.cloud.storage.BucketInfo$DeleteRule**
- class **com.google.cloud.storage.BucketInfo$IamConfiguration$Builder**
- class **com.google.cloud.storage.BucketInfo$IamConfiguration**
- class **com.google.cloud.storage.BucketInfo$IsLiveDeleteRule**
- class **com.google.cloud.storage.BucketInfo$LifecycleRule$DeleteLifecycleAction**
- class **com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleAction**
- class **com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder**
- class **com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition**
- class **com.google.cloud.storage.BucketInfo$LifecycleRule$SetStorageClassLifecycleAction**
- class **com.google.cloud.storage.BucketInfo$LifecycleRule**
- class **com.google.cloud.storage.BucketInfo$NumNewerVersionsDeleteRule**
- class **com.google.cloud.storage.BucketInfo**
- class **com.google.cloud.storage.CanonicalExtensionHeadersSerializer**
- class **com.google.cloud.storage.CopyWriter**
- class **com.google.cloud.storage.Cors$Builder**
- class **com.google.cloud.storage.Cors$Origin**
- class **com.google.cloud.storage.Cors**
- class **com.google.cloud.storage.HttpMethod**
- class **com.google.cloud.storage.Option**
- class **com.google.cloud.storage.ServiceAccount**
- class **com.google.cloud.storage.SignatureInfo$Builder**
- class **com.google.cloud.storage.SignatureInfo**
- enum **com.google.cloud.storage.Storage$BlobField**
- class **com.google.cloud.storage.Storage$BlobGetOption**
- class **com.google.cloud.storage.Storage$BlobListOption**
- class **com.google.cloud.storage.Storage$BlobSourceOption**
- class **com.google.cloud.storage.Storage$BlobTargetOption**
- class **com.google.cloud.storage.Storage$BlobWriteOption**
- enum **com.google.cloud.storage.Storage$BucketField**
- class **com.google.cloud.storage.Storage$BucketGetOption**
- class **com.google.cloud.storage.Storage$BucketListOption**
- class **com.google.cloud.storage.Storage$BucketSourceOption**
- class **com.google.cloud.storage.Storage$BucketTargetOption**
- class **com.google.cloud.storage.Storage$ComposeRequest$Builder**
- class **com.google.cloud.storage.Storage$ComposeRequest$SourceBlob**
- class **com.google.cloud.storage.Storage$ComposeRequest**
- class **com.google.cloud.storage.Storage$CopyRequest$Builder**
- class **com.google.cloud.storage.Storage$CopyRequest**
- enum **com.google.cloud.storage.Storage$PredefinedAcl**
- class **com.google.cloud.storage.Storage$SignUrlOption**
- interface **com.google.cloud.storage.Storage**
- class **com.google.cloud.storage.StorageBatch**
- class **com.google.cloud.storage.StorageBatchResult**
- class **com.google.cloud.storage.StorageClass**
- class **com.google.cloud.storage.StorageException**
- interface **com.google.cloud.storage.StorageFactory**
- class **com.google.cloud.storage.StorageOptions$Builder**
- class **com.google.cloud.storage.StorageOptions$DefaultStorageFactory**
- class **com.google.cloud.storage.StorageOptions$DefaultStorageRpcFactory**
- class **com.google.cloud.storage.StorageOptions**
- class **com.google.cloud.storage.StorageRoles**
- class **com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder**
- class **com.google.cloud.storage.contrib.nio.CloudStorageConfiguration**
- class **com.google.cloud.storage.contrib.nio.CloudStorageFileAttributeView**
- interface **com.google.cloud.storage.contrib.nio.CloudStorageFileAttributes**
- class **com.google.cloud.storage.contrib.nio.CloudStorageFileSystem**
- class **com.google.cloud.storage.contrib.nio.CloudStorageFileSystemProvider**
- class **com.google.cloud.storage.contrib.nio.CloudStorageObjectImmutableException**
- interface **com.google.cloud.storage.contrib.nio.CloudStorageOption$Copy**
- interface **com.google.cloud.storage.contrib.nio.CloudStorageOption$Open**
- interface **com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy**
- interface **com.google.cloud.storage.contrib.nio.CloudStorageOption**
- class **com.google.cloud.storage.contrib.nio.CloudStorageOptions**
- class **com.google.cloud.storage.contrib.nio.CloudStoragePath**
- class **com.google.cloud.storage.contrib.nio.CloudStoragePseudoDirectoryException**
- class **com.google.cloud.storage.contrib.nio.CloudStorageRetryHandler**
- class **com.google.cloud.storage.contrib.nio.SeekableByteChannelPrefetcher$Statistics**
- class **com.google.cloud.storage.contrib.nio.SeekableByteChannelPrefetcher**
- class **com.google.cloud.storage.contrib.nio.testing.LocalStorageHelper**
- interface **com.google.cloud.storage.spi.StorageRpcFactory**
- class **com.google.cloud.storage.spi.v1.HttpStorageRpc**
- interface **com.google.cloud.storage.spi.v1.RpcBatch$Callback**
- interface **com.google.cloud.storage.spi.v1.RpcBatch**
- enum **com.google.cloud.storage.spi.v1.StorageRpc$Option**
- class **com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest**
- class **com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse**
- interface **com.google.cloud.storage.spi.v1.StorageRpc**
- class **com.google.cloud.storage.testing.RemoteStorageHelper$StorageHelperException**
- class **com.google.cloud.storage.testing.RemoteStorageHelper**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.

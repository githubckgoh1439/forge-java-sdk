// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: upgrade_node.proto

package forge_abi;

public final class UpgradeNode {
  private UpgradeNode() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpgradeNodeTxOrBuilder extends
      // @@protoc_insertion_point(interface_extends:forge_abi.UpgradeNodeTx)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * the height node will be stopped at.
     * </pre>
     *
     * <code>uint64 height = 1;</code>
     */
    long getHeight();

    /**
     * <pre>
     * the version next release is expected
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    java.lang.String getVersion();
    /**
     * <pre>
     * the version next release is expected
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    com.google.protobuf.ByteString
        getVersionBytes();

    /**
     * <pre>
     * override the existing upgrade settings if there's already one. Use it with
     * cautious.
     * </pre>
     *
     * <code>bool override = 3;</code>
     */
    boolean getOverride();
  }
  /**
   * Protobuf type {@code forge_abi.UpgradeNodeTx}
   */
  public  static final class UpgradeNodeTx extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:forge_abi.UpgradeNodeTx)
      UpgradeNodeTxOrBuilder {
    // Use UpgradeNodeTx.newBuilder() to construct.
    private UpgradeNodeTx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpgradeNodeTx() {
      height_ = 0L;
      version_ = "";
      override_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private UpgradeNodeTx(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              height_ = input.readUInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              version_ = s;
              break;
            }
            case 24: {

              override_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return forge_abi.UpgradeNode.internal_static_forge_abi_UpgradeNodeTx_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return forge_abi.UpgradeNode.internal_static_forge_abi_UpgradeNodeTx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              forge_abi.UpgradeNode.UpgradeNodeTx.class, forge_abi.UpgradeNode.UpgradeNodeTx.Builder.class);
    }

    public static final int HEIGHT_FIELD_NUMBER = 1;
    private long height_;
    /**
     * <pre>
     * the height node will be stopped at.
     * </pre>
     *
     * <code>uint64 height = 1;</code>
     */
    public long getHeight() {
      return height_;
    }

    public static final int VERSION_FIELD_NUMBER = 2;
    private volatile java.lang.Object version_;
    /**
     * <pre>
     * the version next release is expected
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * the version next release is expected
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OVERRIDE_FIELD_NUMBER = 3;
    private boolean override_;
    /**
     * <pre>
     * override the existing upgrade settings if there's already one. Use it with
     * cautious.
     * </pre>
     *
     * <code>bool override = 3;</code>
     */
    public boolean getOverride() {
      return override_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (height_ != 0L) {
        output.writeUInt64(1, height_);
      }
      if (!getVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
      }
      if (override_ != false) {
        output.writeBool(3, override_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (height_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, height_);
      }
      if (!getVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
      }
      if (override_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, override_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof forge_abi.UpgradeNode.UpgradeNodeTx)) {
        return super.equals(obj);
      }
      forge_abi.UpgradeNode.UpgradeNodeTx other = (forge_abi.UpgradeNode.UpgradeNodeTx) obj;

      boolean result = true;
      result = result && (getHeight()
          == other.getHeight());
      result = result && getVersion()
          .equals(other.getVersion());
      result = result && (getOverride()
          == other.getOverride());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHeight());
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
      hash = (37 * hash) + OVERRIDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOverride());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static forge_abi.UpgradeNode.UpgradeNodeTx parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static forge_abi.UpgradeNode.UpgradeNodeTx parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static forge_abi.UpgradeNode.UpgradeNodeTx parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static forge_abi.UpgradeNode.UpgradeNodeTx parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static forge_abi.UpgradeNode.UpgradeNodeTx parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static forge_abi.UpgradeNode.UpgradeNodeTx parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static forge_abi.UpgradeNode.UpgradeNodeTx parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static forge_abi.UpgradeNode.UpgradeNodeTx parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static forge_abi.UpgradeNode.UpgradeNodeTx parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static forge_abi.UpgradeNode.UpgradeNodeTx parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(forge_abi.UpgradeNode.UpgradeNodeTx prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code forge_abi.UpgradeNodeTx}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:forge_abi.UpgradeNodeTx)
        forge_abi.UpgradeNode.UpgradeNodeTxOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return forge_abi.UpgradeNode.internal_static_forge_abi_UpgradeNodeTx_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return forge_abi.UpgradeNode.internal_static_forge_abi_UpgradeNodeTx_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                forge_abi.UpgradeNode.UpgradeNodeTx.class, forge_abi.UpgradeNode.UpgradeNodeTx.Builder.class);
      }

      // Construct using forge_abi.UpgradeNode.UpgradeNodeTx.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        height_ = 0L;

        version_ = "";

        override_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return forge_abi.UpgradeNode.internal_static_forge_abi_UpgradeNodeTx_descriptor;
      }

      public forge_abi.UpgradeNode.UpgradeNodeTx getDefaultInstanceForType() {
        return forge_abi.UpgradeNode.UpgradeNodeTx.getDefaultInstance();
      }

      public forge_abi.UpgradeNode.UpgradeNodeTx build() {
        forge_abi.UpgradeNode.UpgradeNodeTx result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public forge_abi.UpgradeNode.UpgradeNodeTx buildPartial() {
        forge_abi.UpgradeNode.UpgradeNodeTx result = new forge_abi.UpgradeNode.UpgradeNodeTx(this);
        result.height_ = height_;
        result.version_ = version_;
        result.override_ = override_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof forge_abi.UpgradeNode.UpgradeNodeTx) {
          return mergeFrom((forge_abi.UpgradeNode.UpgradeNodeTx)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(forge_abi.UpgradeNode.UpgradeNodeTx other) {
        if (other == forge_abi.UpgradeNode.UpgradeNodeTx.getDefaultInstance()) return this;
        if (other.getHeight() != 0L) {
          setHeight(other.getHeight());
        }
        if (!other.getVersion().isEmpty()) {
          version_ = other.version_;
          onChanged();
        }
        if (other.getOverride() != false) {
          setOverride(other.getOverride());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        forge_abi.UpgradeNode.UpgradeNodeTx parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (forge_abi.UpgradeNode.UpgradeNodeTx) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long height_ ;
      /**
       * <pre>
       * the height node will be stopped at.
       * </pre>
       *
       * <code>uint64 height = 1;</code>
       */
      public long getHeight() {
        return height_;
      }
      /**
       * <pre>
       * the height node will be stopped at.
       * </pre>
       *
       * <code>uint64 height = 1;</code>
       */
      public Builder setHeight(long value) {
        
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the height node will be stopped at.
       * </pre>
       *
       * <code>uint64 height = 1;</code>
       */
      public Builder clearHeight() {
        
        height_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object version_ = "";
      /**
       * <pre>
       * the version next release is expected
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public java.lang.String getVersion() {
        java.lang.Object ref = version_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          version_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * the version next release is expected
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public com.google.protobuf.ByteString
          getVersionBytes() {
        java.lang.Object ref = version_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          version_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * the version next release is expected
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public Builder setVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the version next release is expected
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public Builder clearVersion() {
        
        version_ = getDefaultInstance().getVersion();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the version next release is expected
       * </pre>
       *
       * <code>string version = 2;</code>
       */
      public Builder setVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        version_ = value;
        onChanged();
        return this;
      }

      private boolean override_ ;
      /**
       * <pre>
       * override the existing upgrade settings if there's already one. Use it with
       * cautious.
       * </pre>
       *
       * <code>bool override = 3;</code>
       */
      public boolean getOverride() {
        return override_;
      }
      /**
       * <pre>
       * override the existing upgrade settings if there's already one. Use it with
       * cautious.
       * </pre>
       *
       * <code>bool override = 3;</code>
       */
      public Builder setOverride(boolean value) {
        
        override_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * override the existing upgrade settings if there's already one. Use it with
       * cautious.
       * </pre>
       *
       * <code>bool override = 3;</code>
       */
      public Builder clearOverride() {
        
        override_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:forge_abi.UpgradeNodeTx)
    }

    // @@protoc_insertion_point(class_scope:forge_abi.UpgradeNodeTx)
    private static final forge_abi.UpgradeNode.UpgradeNodeTx DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new forge_abi.UpgradeNode.UpgradeNodeTx();
    }

    public static forge_abi.UpgradeNode.UpgradeNodeTx getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpgradeNodeTx>
        PARSER = new com.google.protobuf.AbstractParser<UpgradeNodeTx>() {
      public UpgradeNodeTx parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpgradeNodeTx(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpgradeNodeTx> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpgradeNodeTx> getParserForType() {
      return PARSER;
    }

    public forge_abi.UpgradeNode.UpgradeNodeTx getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_forge_abi_UpgradeNodeTx_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_forge_abi_UpgradeNodeTx_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022upgrade_node.proto\022\tforge_abi\"B\n\rUpgra" +
      "deNodeTx\022\016\n\006height\030\001 \001(\004\022\017\n\007version\030\002 \001(" +
      "\t\022\020\n\010override\030\003 \001(\010b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_forge_abi_UpgradeNodeTx_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_forge_abi_UpgradeNodeTx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_forge_abi_UpgradeNodeTx_descriptor,
        new java.lang.String[] { "Height", "Version", "Override", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

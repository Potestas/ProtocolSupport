package protocolsupport.protocol.transformer.middlepacketimpl.serverbound.play.v_1_5;

import java.io.IOException;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.PacketDataSerializer;
import protocolsupport.protocol.transformer.middlepacket.serverbound.play.MiddlePlayerAbilities;
import protocolsupport.protocol.transformer.middlepacketimpl.SupportedVersions;

@SupportedVersions({ProtocolVersion.MINECRAFT_1_5_2})
public class PlayerAbilities extends MiddlePlayerAbilities {

	@Override
	public void readFromClientData(PacketDataSerializer serializer) throws IOException {
		flags = serializer.readUnsignedByte();
		flySpeed = serializer.readUnsignedByte() / 255.0F;
		walkSpeed = serializer.readUnsignedByte() / 255.0F;
	}

}
package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_1_9_r1__1_9_r2;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.packet.ClientBoundPacket;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleWorldCustomSound;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.utils.recyclable.RecyclableCollection;
import protocolsupport.utils.recyclable.RecyclableSingletonList;

public class WorldCustomSound extends MiddleWorldCustomSound<RecyclableCollection<ClientBoundPacketData>> {

	@Override
	public RecyclableCollection<ClientBoundPacketData> toData(ProtocolVersion version) {
		ClientBoundPacketData serializer = ClientBoundPacketData.create(ClientBoundPacket.PLAY_WORLD_CUSTOM_SOUND, version);
		serializer.writeString(id);
		serializer.writeVarInt(category);
		serializer.writeInt(x);
		serializer.writeInt(y);
		serializer.writeInt(z);
		serializer.writeFloat(volume);
		serializer.writeByte((int) (pitch * 63.5));
		return RecyclableSingletonList.create(serializer);
	}

}

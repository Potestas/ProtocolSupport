package protocolsupport.protocol.packet.middle.serverbound.play;

import protocolsupport.protocol.packet.ServerBoundPacket;
import protocolsupport.protocol.packet.middle.ServerBoundMiddlePacket;
import protocolsupport.protocol.packet.middleimpl.ServerBoundPacketData;
import protocolsupport.utils.nms.ItemStackWrapper;
import protocolsupport.utils.recyclable.RecyclableCollection;
import protocolsupport.utils.recyclable.RecyclableSingletonList;

public abstract class MiddleCreativeSetSlot extends ServerBoundMiddlePacket {

	protected int slot;
	protected ItemStackWrapper itemstack;

	@Override
	public RecyclableCollection<ServerBoundPacketData> toNative() {
		ServerBoundPacketData creator = ServerBoundPacketData.create(ServerBoundPacket.PLAY_CREATIVE_SET_SLOT);
		creator.writeShort(slot);
		creator.writeItemStack(itemstack);
		return RecyclableSingletonList.create(creator);
	}

}

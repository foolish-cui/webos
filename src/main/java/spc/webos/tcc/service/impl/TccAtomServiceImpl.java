package spc.webos.tcc.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import spc.webos.tcc.service.TCC;
import spc.webos.tcc.service.TccAtomService;

public class TccAtomServiceImpl extends BaseTccAtomService implements TccAtomService
{
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public int doTring(TCC tcc)
	{
		return super.doTring(tcc);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int doTried(TCC tcc)
	{
		return super.doTried(tcc);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int doConfirm(TCC tcc)
	{
		return super.doConfirm(tcc);
	}

	// 1. ���ĳtcc���׷���ԭ��������Ϊ��ˮ�Ŵ��ڣ���ʱ�ٷ���cancel�������cancel�����˵�ԭ����
	// 2. ���ԭ��������cancel���׵����ҪԤ��վλ
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int doCancel(TCC tcc)
	{
		return super.doCancel(tcc);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public int insertCancel(TCC tcc)
	{
		return super.insertCancel(tcc);
	}

}
